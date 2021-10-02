package com.example.demo.service.banner_offer;



import java.util.List;

import com.example.demo.entity.astro.astro;
import com.example.demo.entity.banner_offfer.banner_offer;

public interface banner_offerService {

	public List<banner_offer> getBanner();
	public banner_offer addBanner(banner_offer banner1);
	
}
