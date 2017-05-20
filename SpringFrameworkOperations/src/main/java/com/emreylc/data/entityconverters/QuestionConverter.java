package com.emreylc.data.entityconverters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.emreylc.data.entities.Question;
import com.emreylc.data.services.QuestionService;

public class QuestionConverter implements Converter<String, Question> {

	@Autowired
	QuestionService questionService;

	@Override
	public Question convert(String answerId) {
		return questionService.getQuestionRepo().findOne(Long.getLong(answerId));
	}

}
