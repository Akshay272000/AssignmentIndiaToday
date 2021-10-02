package com.example.demo.dao.question;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.questions.Question_json;

public interface daoQuestion extends JpaRepository<Question_json, Integer>{

}
