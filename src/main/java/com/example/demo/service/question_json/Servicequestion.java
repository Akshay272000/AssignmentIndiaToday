package com.example.demo.service.question_json;

import java.util.List;

import com.example.demo.entity.questions.Question_json;

public interface Servicequestion {

	public Question_json addQuestion(Question_json que);
	public List<Question_json> getAll();
	
}
