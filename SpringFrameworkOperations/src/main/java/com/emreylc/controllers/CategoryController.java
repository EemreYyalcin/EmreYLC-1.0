package com.emreylc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emreylc.data.entities.Category;
import com.emreylc.data.entities.Question;
import com.emreylc.data.services.CategoryService;
import com.emreylc.data.services.QuestionService;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private QuestionService questionService;

	// @Autowired
	// private Message messageBean;

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		model.addAttribute("categories", categoryService.getCategoryRepo().findAll());
		model.addAttribute("category", new Category());
		return "viewcategory";
	}

	@RequestMapping("/add")
	public String addCategory(Model model, @ModelAttribute Category category) {
		categoryService.getCategoryRepo().save(category);
		model.addAttribute("categories", categoryService.getCategoryRepo().findAll());
		model.addAttribute("category", new Category());
		return "viewcategory";
	}

	@RequestMapping(value = "/{categoryId}")
	public String getCategory(Model model, @PathVariable("categoryId") Long categoryId) {
		model.addAttribute("questions", questionService.getQuestionRepo().findByCategoryIdEquals(categoryId));
		model.addAttribute("question", new Question());
		return "viewquestion";
	}

}
