package com.example.demo.controller.reports;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.horoscope_json.response1;
import com.example.demo.entity.reports.Reports;
import com.example.demo.entity.reports.response2;
import com.example.demo.entity.reports.services;
import com.example.demo.service.reports.ReportsServiceImpl;

@RestController
@RequestMapping("/reports")
public class ReportsController {

	@Autowired
	private ReportsServiceImpl servicerepo;
	
	
	@GetMapping
	public response2 getrepo()
	{
		List<Reports> repo = this.servicerepo.getreports();
		return new response2("Ok" , "200" ,"true" ,"Services fetched successfully." ,"Get all services." , new services(repo));
	}
	
	@PostMapping
	public Reports addreop(@RequestBody Reports repo)
	{
		return this.servicerepo.addreports(repo);
	}
	
}
