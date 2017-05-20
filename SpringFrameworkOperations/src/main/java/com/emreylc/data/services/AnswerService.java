package com.emreylc.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emreylc.data.repositories.AnswerRepo;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepo answerRepo;

	public AnswerRepo getAnswerRepo() {
		return answerRepo;
	}

	public void setAnswerRepo(AnswerRepo answerRepo) {
		this.answerRepo = answerRepo;
	}
}
