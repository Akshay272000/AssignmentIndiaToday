package com.example.demo.controller.horoscope;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.banner_offfer.banner_offer;
import com.example.demo.entity.banner_offfer.response;
import com.example.demo.entity.horoscope_json.allHoroscope;
import com.example.demo.entity.horoscope_json.response1;
import com.example.demo.service.horoscope.horoscopeService;

@RestController
@RequestMapping("/horoscope")
public class horoscopeController {

	@Autowired
	private horoscopeService horo_service;
	
	@PostMapping
	   public allHoroscope addhoro(@RequestBody allHoroscope horo)
	   {
		   return this.horo_service.addhoroscope(horo);
	   }
	@GetMapping
	public response1 gethoro()
	{
		List<allHoroscope> horo = this.horo_service.getAllhoro();
		return new response1("Ok" , "200" ,"true" ,"fetched successfully" ,"Get all daily horoscopes" , horo);
	}
	
	
}
