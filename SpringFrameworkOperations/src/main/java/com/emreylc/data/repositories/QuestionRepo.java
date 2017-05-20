package com.emreylc.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emreylc.data.entities.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {

	public List<Question> findByCategoryIdEquals(Long categoryid);

}
