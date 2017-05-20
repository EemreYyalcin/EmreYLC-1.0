package com.emreylc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emreylc.data.entities.User;

@Controller
public class HomeController {
	//
	// @Autowired
	// private UserService userService;
	// @Autowired
	// private UserInformationService userInformationService;
	// @Autowired
	// private CategoryService categoryService;
	// @Autowired
	// private QuestionService questionService;
	// @Autowired
	// private OptionService optionService;
	// @Autowired
	// private AnswerService answerService;

	@RequestMapping("/")
	public String goHome(Model model) {
		// ControllerLoader.getUser(userService, userInformationService,
		// categoryService, questionService, optionService);

		// ControllerLoader.addAnswer(answerService, userService,
		// userInformationService, categoryService, questionService,
		// optionService);
		// Answer answer = answerService.getAnswerRepo().findOne(4L);
		// System.out.println("DEBUG");
		// System.out.println(answer.getAnswers().toString());
		model.addAttribute("user", new User());
		return "redirect:category/getAll";
	}

}
