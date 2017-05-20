package com.emreylc.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emreylc.data.entities.Answer;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Long> {

}
