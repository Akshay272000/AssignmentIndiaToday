package com.example.demo.dao.reports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.reports.Reports;

public interface daoReports  extends JpaRepository<Reports, Integer>{

	
////	@Query(value = "insert into reports values (58,\"asasasasasasasasasasasa\", \"qwer\", \"tyui\", \"66\", \"50\", \"ASS\");")
//	@Query(value = "insert into reports values (id,\"description\", \"image_url\",\" name\", \"offer_price\", \"price\", \"product_code\")" , nativeQuery =  true)
//	Reports reporSave(Reports repo);
	
	
}
