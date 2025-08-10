package com.adithya.quizService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adithya.quizService.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
