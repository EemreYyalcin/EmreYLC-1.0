package com.emreylc.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emreylc.data.repositories.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	public CategoryRepo getCategoryRepo() {
		return categoryRepo;
	}

	public void setCategoryRepo(CategoryRepo categoryRepo) {
		this.categoryRepo = categoryRepo;
	}
}
