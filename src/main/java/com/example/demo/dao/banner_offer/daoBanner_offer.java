package com.example.demo.dao.banner_offer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.banner_offfer.banner_offer;

@Repository
public interface daoBanner_offer  extends JpaRepository<banner_offer, Integer>{

//	banner_offer findByName(String name);
	
	
}
