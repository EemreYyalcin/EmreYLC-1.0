package com.emreylc.controllers;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.emreylc.ejb.counters.Message;

@ControllerAdvice
public class GlobalControllerAdvice {

	@Autowired
	private Message messageBean;

	@ModelAttribute("currentDate")
	public Date getCurrentDate() {
		return new Date();
	}

	// @InitBinder
	// public void initBinder(WebDataBinder binder) {
	// binder.addValidators(new UserAddingValidator());
	// }

	@ExceptionHandler(NullPointerException.class)
	public String handleError(HttpServletRequest request) {
		return "controller_error";
	}

	@ModelAttribute("messages")
	public ArrayList<String> getMessages() {
		return messageBean.getMessageList();
	}

}
