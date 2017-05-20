package com.emreylc.data.entityconverters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.emreylc.data.entities.UserInformation;
import com.emreylc.data.services.UserInformationService;

public class UserInformationConverter implements Converter<String, UserInformation> {

	@Autowired
	UserInformationService userInformationService;

	@Override
	public UserInformation convert(String answerId) {
		return userInformationService.getUserInformationRepo().findOne(Long.getLong(answerId));
	}

}
