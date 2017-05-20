package com.emreylc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emreylc.data.entities.User;
import com.emreylc.data.services.UserInformationService;
import com.emreylc.data.services.UserService;
import com.emreylc.ejb.counters.Message;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private UserInformationService userInformationService;

	@Autowired
	private Message messageBean;

	@RequestMapping("/login")
	public String login(@ModelAttribute User user) {
		User tempUser = userService.getUserRepo().findByUserNameLikeAndPasswordLike(user.getUserName(), user.getPassword());

		if (tempUser != null) {
			messageBean.setMessageNext("Login Success!!");
		} else {
			messageBean.setMessageNext("Login Failed!!");
		}
		return "message";
	}
	@RequestMapping("/signin")
	public String signIn(@ModelAttribute User user) {

		User tempUser = userService.getUserRepo().findByUserNameLikeAndPasswordLike(user.getUserName(), user.getPassword());

		if (tempUser != null) {
			messageBean.setMessageNext("SignIn Unsuccesfully!!");
			return "message";
		} else {
			messageBean.setMessageNext("SignIn Successfully!!");
			userInformationService.getUserInformationRepo().save(user.getUserInformation());
			userService.getUserRepo().save(user);
		}
		return "message";

	}

}
