package com.example.demo.service.astro;

import com.example.demo.entity.astro.LargeImage;
import com.example.demo.entity.astro.MediumImage;

public interface ImageService {

	public MediumImage addMedium(MediumImage mediimg);
	public MediumImage getMedium(int id);
	public LargeImage addLarge(LargeImage largeimg);
	public LargeImage getLarge(int id);
}
