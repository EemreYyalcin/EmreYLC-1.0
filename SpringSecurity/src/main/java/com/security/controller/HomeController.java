package com.security.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.security.domain.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView getHomePage(@AuthenticationPrincipal User user) {
		return new ModelAndView("home", "user", user);
	}
}
