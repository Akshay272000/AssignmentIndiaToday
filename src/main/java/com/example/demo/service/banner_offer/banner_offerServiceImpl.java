package com.example.demo.service.banner_offer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.banner_offer.daoBanner_offer;
import com.example.demo.entity.banner_offfer.banner_offer;

@Service
public class banner_offerServiceImpl implements banner_offerService {

	@Autowired
	private daoBanner_offer dao2;
	
	@Override
	public List<banner_offer> getBanner() {
		// TODO Auto-generated method stub
		return dao2.findAll();
	}

	@Override
	public banner_offer  addBanner(banner_offer banner1) {
		dao2.save(banner1);
		return banner1;
	}



}
