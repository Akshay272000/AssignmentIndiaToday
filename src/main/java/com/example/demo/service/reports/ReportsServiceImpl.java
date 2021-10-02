package com.example.demo.service.reports;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.reports.daoReports;
import com.example.demo.entity.reports.Reports;

@Service
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private daoReports repodao;
	
	@Override
	public Reports addreports(Reports repo1) {
		// TODO Auto-generated method stub
		return repodao.save(repo1);
	}

	@Override
	public List<Reports> getreports() {
		// TODO Auto-generated method stub
		return repodao.findAll();
	}

}
