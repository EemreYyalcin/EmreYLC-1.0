package com.emreylc.ejb.counters;

public class PageCounter {

	private int pageNumber;

	public PageCounter(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageNumber(String token) {
		if (token.startsWith("next") || token.startsWith("Next") || token.startsWith("NEXT")) {
			return nextPage();
		}
		if (token.startsWith("previous") || token.startsWith("Previous") || token.startsWith("PREVIOUS")) {
			return proviousPage();
		}
		return 0;
	}

	private int nextPage() {
		return ++pageNumber;
	}

	private int proviousPage() {
		if (pageNumber > 0) {
			return --pageNumber;
		}
		return pageNumber;
	}

}
