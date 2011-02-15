package com.james.page;

import org.apache.log4j.Logger;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class BasePage {

	protected final HtmlPage page;
	private Logger logger;

	public BasePage(HtmlPage page) {
		this.page = page;
		this.logger = Logger.getLogger(this.getClass());

		logger.info("Navigated to: " + page.getUrl());
	}

}
