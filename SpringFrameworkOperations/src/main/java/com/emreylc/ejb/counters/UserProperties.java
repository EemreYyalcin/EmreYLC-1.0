package com.emreylc.ejb.counters;

import java.util.Properties;

public class UserProperties {

	private Properties pageCounterProperties = new Properties();

	public PageCounter getPageCounter(String pageId) {
		PageCounter pageCounter;
		if (pageCounterProperties.get(pageId) == null) {
			pageCounter = new PageCounter(0);
			pageCounterProperties.put(pageId, pageCounter);
			return pageCounter;
		} else {
			return (PageCounter) pageCounterProperties.get(pageId);
		}
	}

}
