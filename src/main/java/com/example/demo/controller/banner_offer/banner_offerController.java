package com.example.demo.controller.banner_offer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.banner_offer.daoBanner_offer;
import com.example.demo.entity.astro.astro;
import com.example.demo.entity.banner_offfer.banner_offer;
import com.example.demo.entity.banner_offfer.response;
import com.example.demo.service.banner_offer.banner_offerService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/banner_offer")
public class banner_offerController {

	@Autowired
	private daoBanner_offer dao2;
	@Autowired
	private banner_offerService Banner_service;
	
//	@GetMapping("/{id}")
//	   public ResponseEntity<banner_offer> getBanner(@PathVariable String id)
//	   {
////		 Optional<banner_offer> banner=dao2.findById(Integer.parseInt(id));
//		banner_offer offer = Banner_service.getBanner(Integer.parseInt(id));
////		   Optional<banner_offer> banner = this.Banner_service.getBanner(Integer.parseInt(id));
//		   return ResponseEntity.status(HttpStatus.OK).body(offer);
//	   }
//	
	
	@GetMapping
	   public response getBanner()
	   {
//		ObjectMapper mapper =  new ObjectMapper();
		List<banner_offer> offer = this.Banner_service.getBanner();
		   return new response("Ok" , "200" ,"true" ,"Banners fetched successfully" ,"Fetch Banner" , offer);
	   }
	
	
	 @PostMapping
	   public banner_offer addbanner(@RequestBody banner_offer banner1)
	   {
		   return this.Banner_service.addBanner(banner1);
	   }
}
