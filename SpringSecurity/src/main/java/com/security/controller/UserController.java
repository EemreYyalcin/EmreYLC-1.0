package com.security.controller;

import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.security.domain.User;
import com.security.service.UserService;
import com.security.validation.RegisterValidator;

@Controller
public class UserController {

	private final UserService userService;
	private final RegisterValidator registerValidator;

	@Autowired
	public UserController(UserService userService, RegisterValidator registerValidator) {
		this.userService = userService;
		this.registerValidator = registerValidator;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(registerValidator);
	}

	@RequestMapping("/register")
	public ModelAndView getRegisterPage() {
		return new ModelAndView("register", "user", new User());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String handleRegisterForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "register";
		}
		userService.addUser(user);
		return "redirect:/";
	}

	@RequestMapping("/users/{id}/items")
	public ModelAndView getUserPage(@PathVariable Long id) {
		if (userService.getUserById(id) == null) {
			throw new NoSuchElementException("User with id:" + id + " not found");
		} else {
			return new ModelAndView("userItems", "items", userService.getUserOfItems(id));
		}

	}

}
