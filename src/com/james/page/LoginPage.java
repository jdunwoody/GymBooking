package com.james.page;

import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.RefreshHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class LoginPage extends BasePage {
	private static final String LOGIN_BUTTON = "ctl00$MainContent$imgBtnLogin";
	private static final String LOGIN_FORM_PASSWORD = "ctl00$MainContent$InputPassword";
	private static final String LOGIN_FORM_USERNAME = "ctl00$MainContent$InputLogin";
	private static final String PASSWORD = "0007";
	private static final String USERNAME = "2003677";
	private static final String LOGIN_URL = "http://mylocker.virginactive.com.au/Connect3/MRMLogin.aspx";

	private final HtmlForm form;
	private final WebClient webClient;
	private Logger logger;

	public static LoginPage gotoLoginPage() throws Exception {
		WebClient webClient = new WebClient(BrowserVersion.FIREFOX_3);

		webClient.setThrowExceptionOnScriptError(false);
		webClient.setThrowExceptionOnFailingStatusCode(false);

		webClient.setRefreshHandler(new RefreshHandler() {
			public void handleRefresh(Page page, URL url, int arg) throws IOException {
				System.out.println("handleRefresh");
			}
		});

		Logger.getLogger(LoginPage.class).info("Navigating to: " + LOGIN_URL);
		HtmlPage loginPage = (HtmlPage) webClient.getPage(LOGIN_URL);

		return new LoginPage(webClient, loginPage);
	}

	public LoginPage(WebClient webClient, HtmlPage page) {
		super(page);
		this.logger = Logger.getLogger(this.getClass());
		this.webClient = webClient;
		this.form = page.getForms().get(0);
	}

	public FrontPage login() throws Exception {
		inputFormField(LOGIN_FORM_USERNAME, USERNAME);
		inputFormField(LOGIN_FORM_PASSWORD, PASSWORD);

		HtmlPage frontPage = (HtmlPage) form.getInputByName(LOGIN_BUTTON).click();
		return new FrontPage(webClient, frontPage);
	}

	private void inputFormField(String fieldName, String fieldValue) {
		logger.info("Inputting: " + fieldName + ", with (" + fieldValue + ")");
		HtmlInput field = form.getInputByName(fieldName);
		field.setValueAttribute(fieldValue);
	}
}
