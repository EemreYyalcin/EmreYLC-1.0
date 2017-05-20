package com.emreylc.ejb.counters;

import java.util.ArrayList;

public class Message {

	private ArrayList<String> messageList = new ArrayList<>();

	public String getMessageNext() {
		String message = "No Message";
		if (messageList.size() > 0) {
			message = messageList.get(0);
		}
		return message;
	}

	public void setMessageNext(String message) {
		messageList.add(message);
	}

	public ArrayList<String> getMessageList() {
		return messageList;
	}

}
