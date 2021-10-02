package com.example.demo.service.astro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.astro.daoAstro;
import com.example.demo.entity.astro.astro;


@Service
public class astroServiceImpl implements astroService{

	@Autowired 
	private daoAstro dao1;
	
	@Override
	public astro addAstro(astro astro1) {
		dao1.save(astro1);
		return astro1;
	}

	@Override
	public astro getAstro(int id) {
		return dao1.findById(id).get();
	
	}

	

	

}
