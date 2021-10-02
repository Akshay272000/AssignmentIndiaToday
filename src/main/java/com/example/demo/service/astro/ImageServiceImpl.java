package com.example.demo.service.astro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.astro.LargeDao;
import com.example.demo.dao.astro.MediumImageDao;
import com.example.demo.entity.astro.LargeImage;
import com.example.demo.entity.astro.MediumImage;

@Service
public class ImageServiceImpl implements ImageService{

	@Autowired
	private MediumImageDao daoMedium;
	
	@Autowired
	private LargeDao daolarge;
	
	@Override
	public MediumImage addMedium(MediumImage mediimg) {
		// TODO Auto-generated method stub
		return daoMedium.save(mediimg);
	}

	@Override
	public MediumImage getMedium(int id) {
		// TODO Auto-generated method stub
		return daoMedium.findById(id).get();
	}

	@Override
	public LargeImage addLarge(LargeImage largeimg) {
		// TODO Auto-generated method stub
		return daolarge.save(largeimg);
	}

	@Override
	public LargeImage getLarge(int id) {
		// TODO Auto-generated method stub
		return daolarge.findById(id).get();
	}

	
	
}
