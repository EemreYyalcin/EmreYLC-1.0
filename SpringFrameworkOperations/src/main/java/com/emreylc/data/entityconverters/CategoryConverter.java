package com.emreylc.data.entityconverters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.emreylc.data.entities.Category;
import com.emreylc.data.services.CategoryService;

public class CategoryConverter implements Converter<String, Category> {

	@Autowired
	CategoryService categoryService;

	@Override
	public Category convert(String answerId) {
		return categoryService.getCategoryRepo().findOne(Long.getLong(answerId));
	}

}
