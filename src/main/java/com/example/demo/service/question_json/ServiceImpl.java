package com.example.demo.service.question_json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.question.daoQuestion;
import com.example.demo.entity.questions.Question_json;

@Service
public class ServiceImpl implements Servicequestion {

	@Autowired
	private daoQuestion daoque;
	
	@Override
	public Question_json addQuestion(Question_json que) {
		// TODO Auto-generated method stub
		return daoque.save(que);
	}

	@Override
	public List<Question_json> getAll() {
		// TODO Auto-generated method stub
		return daoque.findAll();
	}

}
