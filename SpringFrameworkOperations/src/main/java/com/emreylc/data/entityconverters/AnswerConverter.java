package com.emreylc.data.entityconverters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.emreylc.data.entities.Answer;
import com.emreylc.data.services.AnswerService;

public class AnswerConverter implements Converter<String, Answer> {

	@Autowired
	AnswerService answerService;

	@Override
	public Answer convert(String answerId) {
		return answerService.getAnswerRepo().findOne(Long.getLong(answerId));
	}

}
