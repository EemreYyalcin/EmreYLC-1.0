package com.emreylc.data.entityconverters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.emreylc.data.entities.Option;
import com.emreylc.data.services.OptionService;

public class OptionConverter implements Converter<String, Option> {

	@Autowired
	OptionService optionService;

	@Override
	public Option convert(String answerId) {
		return optionService.getOptionRepo().findOne(Long.getLong(answerId));
	}

}
