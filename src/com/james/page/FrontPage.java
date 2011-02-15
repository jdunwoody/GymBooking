package com.james.page;

import org.apache.log4j.Logger;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class FrontPage extends BasePage {
	private final WebClient webClient;
	private Logger logger;

	public FrontPage(WebClient webClient, HtmlPage page) {
		super(page);

		this.logger = Logger.getLogger(this.getClass());
		this.webClient = webClient;
	}

	public BookingPage gotoBooking() throws Exception {
		return new BookingPage(webClient, (HtmlPage) page.getAnchorByHref("http://mylocker.virginactive.com.au/mylocker/").click());
	}
}
