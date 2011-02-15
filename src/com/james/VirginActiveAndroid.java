package com.james;

import org.apache.log4j.Logger;

import com.james.page.BookingPage;
import com.james.page.FrontPage;
import com.james.page.LoginPage;

public class VirginActiveAndroid {
	private Logger logger;

	public VirginActiveAndroid() {
		this.logger = Logger.getLogger(this.getClass());
	}

	public void hitIt() throws Exception {
		LoginPage loginPage = LoginPage.gotoLoginPage();

		FrontPage frontPage = loginPage.login();

		BookingPage bookingPage = frontPage.gotoBooking();

		logger.info(bookingPage.dump());
	}

	public static void main(String[] args) throws Exception {
		new VirginActiveAndroid().hitIt();
	}
}

// dumpToFile(bookAClass.asText());

// System.out.println(dumpToFile(frontPage.getWebResponse().getContentAsString()));

// HtmlElement makeABookingLink =
// frontPage.getHtmlElementById("Book a Booking");

// HtmlPage bookAClassPage = makeABookingLink.click();
// System.out.println(dumpToFile(bookAClassPage.asText()));

// HtmlForm form = loginPage.getFormByName("login_form");
//
// // Enter login and passwd
// form.getInputByName("login").setValueAttribute("@@@@@@@");
// form.getInputByName("passwd").setValueAttribute("@@@@@@@");
//
// // Click "Sign In" button/link
// loginPage = (HtmlPage) form.getInputByValue("Sign In").click();
//
// // Click "Inbox" link
// HtmlAnchor anchor = (HtmlAnchor)
// loginPage.getHtmlElementById("WelcomeInboxFolderLink");
// loginPage = (HtmlPage) anchor.click();

// public void hitIt() throws Exception {
// final WebClient webClient = new WebClient();
// final HtmlPage loginPage =
// webClient.getPage("http://mylocker.virginactive.com.au/Connect3/MRMLogin.aspx");
//
// // ctl00_MainContent_InputLogin
//
// // System.out.println("HtmlUnit - Welcome to HtmlUnit" +
// // loginPage.getTitleText());
//
// final String pageAsXml = loginPage.asXml();
//
// System.out.println(pageAsXml.contains("<body class=\"composite\">"));
//
// final String pageAsText = loginPage.asText();
// System.out.println(pageAsText.contains("Support for the HTTP and HTTPS protocols"));
//
// webClient.closeAllWindows();
// }

//
// public static void main( String args[] ) {
// junit.textui.TestRunner.run( suite() );
// }
//
// public static TestSuite suite() {
// return new TestSuite( PoolEditorTest.class );
// }
//
// public PoolEditorTest( String s ) {
// super( s );
// }
//
// public void testGetForm() throws Exception {
// ServletRunner sr = new ServletRunner( "web.xml" ); // (1) use the web.xml
// file to define mappings
// ServletUnitClient client = sr.newClient(); // (2) create a client to invoke
// the application
//
// try {
// client.getResponse( "http://localhost/PoolEditor" ); // (3) invoke the
// servlet w/o authorization
// fail( "PoolEditor is not protected" );
// } catch (AuthorizationRequiredException e) { // (4) verify that access is
// denied
// }
//
// client.setAuthorization( "aUser", "pool-admin" ); // (5) specify
// authorization and
// client.getResponse( "http://localhost/PoolEditor" ); // invoke the servlet
// again
// }