package example;


public class YahooMail {
	//
	// public static void main(String[] args) throws Exception {
	// // Create and initialize WebClient object
	// WebClient webClient = new WebClient(BrowserVersion.FIREFOX_2);
	// webClient.setThrowExceptionOnScriptError(false);
	// webClient.setRefreshHandler(new RefreshHandler() {
	// public void handleRefresh(Page page, URL url, int arg) throws IOException
	// {
	// System.out.println("handleRefresh");
	// }
	//
	// });
	//
	// // visit Yahoo Mail login page and get the Form object
	// HtmlPage page = (HtmlPage)
	// webClient.getPage("https://login.yahoo.com/config/login_verify2?.intl=us&.src=ym");
	// HtmlForm form = page.getFormByName("login_form");
	//
	// // Enter login and passwd
	// form.getInputByName("login").setValueAttribute("@@@@@@@");
	// form.getInputByName("passwd").setValueAttribute("@@@@@@@");
	//
	// // Click "Sign In" button/link
	// page = (HtmlPage) form.getInputByValue("Sign In").click();
	//
	// // Click "Inbox" link
	// HtmlAnchor anchor = (HtmlAnchor)
	// page.getHtmlElementById("WelcomeInboxFolderLink");
	// page = (HtmlPage) anchor.click();
	//
	// // Get the table object containing the mails
	// HtmlTable dataTable = (HtmlTable) page.getHtmlElementById("datatable");
	//
	// // Go through each row and count the row with class=msgnew
	// int newMessageCount = 0;
	// // List<HtmlTableRow> rows = (List<HtmlTableRow>)
	// // dataTable.getHtmlElementsByTagName("tr");
	// // for (HtmlTableRow row : rows) {
	// // if (row.getAttribute("class").equals("msgnew")) {
	// // newMessageCount++;
	// // }
	// // }
	//
	// // Print the newMessageCount to screen
	// System.out.println("newMessageCount = " + newMessageCount);
	//
	// // System.out.println(page.asXml());
	//
	// }
}