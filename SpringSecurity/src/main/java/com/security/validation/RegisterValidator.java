package com.security.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.security.domain.User;
import com.security.service.UserService;

@Component
public class RegisterValidator implements Validator {

	private final UserService userService;

	public RegisterValidator(UserService userService) {
		this.userService = userService;
	}

	@Override
	public boolean supports(Class<?> aClass) {
		return aClass.equals(User.class);
	}

	@Override
	public void validate(Object o, Errors errors) {

		User form = (User) o;
		validateUsername(errors, form);
	}

	private void validateUsername(Errors errors, User form) {
		if (userService.getUserByUsername(form.getUsername()) != null) {
			errors.reject("username.exists", "User with usernamealready exists");
		}

	}

}
