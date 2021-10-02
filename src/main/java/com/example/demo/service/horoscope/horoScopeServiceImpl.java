package com.example.demo.service.horoscope;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoHoroscope.daoHoro;
import com.example.demo.entity.horoscope_json.allHoroscope;

@Service
public class horoScopeServiceImpl implements horoscopeService {

	@Autowired
	private daoHoro daohoro;
	
	@Override
	public allHoroscope addhoroscope(allHoroscope scope1) {
		// TODO Auto-generated method stub
		return daohoro.save(scope1);
	}

	@Override
	public List<allHoroscope> getAllhoro() {
		// TODO Auto-generated method stub
		return daohoro.findAll();
	}

}
