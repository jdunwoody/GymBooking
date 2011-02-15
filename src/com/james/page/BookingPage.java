package com.james.page;

import org.apache.log4j.Logger;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.james.debug.DebugUtils;

public class BookingPage extends BasePage {
	private final WebClient webClient;
	private Logger logger;

	public BookingPage(WebClient webClient, HtmlPage page) {
		super(page);
		this.logger = Logger.getLogger(this.getClass());

		this.webClient = webClient;
	}

	public String dump() throws Exception {
		return DebugUtils.dumpToFile(page.getTextContent());
	}
}
