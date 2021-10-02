package com.example.demo.controller.question;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.questions.Question_json;
import com.example.demo.entity.questions.response_question;
import com.example.demo.service.question_json.Servicequestion;

@RestController
@RequestMapping("/question")
public class questionController {

	@Autowired
	private Servicequestion serviceque;
	
	
	@GetMapping
	public response_question getall()
	{
		List<Question_json> que = this.serviceque.getAll();
		return new response_question("Ok" , "200" ,"true" ,"Question categories fetched successfully." ,"Get all categories." , que);
	}
	
	@PostMapping
	public Question_json addquestion(@RequestBody Question_json que)
	{
		return this.serviceque.addQuestion(que);
	}
}
