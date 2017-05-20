package com.emreylc.data.entityconverters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.emreylc.data.entities.User;
import com.emreylc.data.services.UserService;

public class UserConverter implements Converter<String, User> {

	@Autowired
	UserService userService;

	@Override
	public User convert(String answerId) {
		return userService.getUserRepo().findOne(Long.getLong(answerId));
	}

}
