package com.emreylc.tests;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;

import com.emreylc.data.entities.Answer;
import com.emreylc.data.entities.Category;
import com.emreylc.data.entities.Option;
import com.emreylc.data.entities.Question;
import com.emreylc.data.entities.User;
import com.emreylc.data.entities.UserInformation;
import com.emreylc.data.services.AnswerService;
import com.emreylc.data.services.CategoryService;
import com.emreylc.data.services.OptionService;
import com.emreylc.data.services.QuestionService;
import com.emreylc.data.services.UserInformationService;
import com.emreylc.data.services.UserService;
import com.emreylc.utils.Generate;
import com.emreylc.utils.GenerateUtil;

public class ControllerLoader {

	private static Option getOption() {

		Option option = new Option();
		option.setClick(10L);
		option.setName("Option " + Generate.getInt());
		option.setData(Generate.generateString());
		return option;
	}

	private static Question getQuestion(QuestionService questionService, OptionService optionService, Category category) {

		Question question = new Question();
		Collection<Question> questionList = new ArrayList<>();
		Collection<Option> optionList = new ArrayList<>();
		question.setQuestion("Question " + Generate.getInt());
		question.setClickA(Generate.getInt());
		question.setClickB(Generate.getInt());
		question.setCategory(category);
		questionService.getQuestionRepo().save(question);
		questionList.add(question);
		Option options1 = getOption();
		Option options2 = getOption();
		options1.setQuestions(questionList);
		options2.setQuestions(questionList);
		optionService.getOptionRepo().save(options1);
		optionService.getOptionRepo().save(options2);
		optionList.add(options1);
		optionList.add(options2);
		question.setOptions(optionList);
		return question;

	}

	private static Category getCategory(CategoryService categoryService, QuestionService questionService, OptionService optionService, User user) {

		Category category = new Category();
		Collection<Question> questions = new ArrayList<>();
		category.setName("Category " + Generate.getInt());
		category.setUser(user);
		categoryService.getCategoryRepo().save(category);
		for (int i = 0; i < 100; i++) {
			questions.add(getQuestion(questionService, optionService, category));
		}
		category.setQuestions(questions);
		return category;
	}

	private static UserInformation getUserInformation() {
		UserInformation userInformation = new UserInformation();
		userInformation.setFirstName(GenerateUtil.getRandomName());
		userInformation.setLastName(GenerateUtil.getRandomName());
		userInformation.setGender(Generate.getInt() % 2 == 0 ? "male" : "female");
		userInformation.setBurnDate(GenerateUtil.getRandomDate());
		return userInformation;

	}

	public static User getUser(UserService userService, UserInformationService userInformationService, CategoryService categoryService, QuestionService questionService, OptionService optionService) {

		User user = new User();
		user.setUserName("Username " + Generate.getInt());
		user.setPassword("Password " + Generate.getInt());

		UserInformation userInformation = getUserInformation();
		userInformationService.getUserInformationRepo().save(userInformation);
		user.setUserInformation(userInformation);

		userService.getUserRepo().save(user);
		Collection<Category> categories = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			categories.add(getCategory(categoryService, questionService, optionService, user));
		}

		user.setCategories(categories);

		return user;
	}

	public static void addAnswer(AnswerService answerService, UserService userService, UserInformationService userInformationService, CategoryService categoryService, QuestionService questionService, OptionService optionService) {

		Answer answer = new Answer();
		answer.setUser(userService.getUserRepo().findOne(1L));
		answer.setCategory(categoryService.getCategoryRepo().findOne(17L));
		BitSet bitSet = new BitSet();
		bitSet.set(2);
		bitSet.set(3);
		bitSet.set(6);
		bitSet.set(10);
		bitSet.set(17);
		BitSet bitSet2 = new BitSet();
		bitSet2.set(2);
		bitSet2.set(3);
		bitSet2.set(6);
		bitSet2.set(10);
		bitSet2.set(17);
		answer.setAnswers2(bitSet2);
		answerService.getAnswerRepo().save(answer);

	}
}
