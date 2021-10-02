package com.example.demo.service.horoscope;

import java.util.List;

import com.example.demo.entity.horoscope_json.allHoroscope;

public interface horoscopeService  {

	public allHoroscope addhoroscope(allHoroscope scope1);
	public List<allHoroscope> getAllhoro();
	
	
}
