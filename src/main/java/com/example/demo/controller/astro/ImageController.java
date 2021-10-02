package com.example.demo.controller.astro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.astro.LargeImage;
import com.example.demo.entity.astro.MediumImage;
import com.example.demo.service.astro.ImageServiceImpl;

@RestController
@RequestMapping("medium")
public class ImageController {

	@Autowired
	private ImageServiceImpl service;
	
	@PostMapping
	public MediumImage addmedi(@RequestBody MediumImage img)
	{
		return this.service.addMedium(img);
	}
	
	@GetMapping("/{id}")
	public MediumImage addmedi(@PathVariable String id)
	{
		return this.service.getMedium(Integer.parseInt(id));
		
	}
	
	@GetMapping("large/{id}")
	public LargeImage getlarge(@PathVariable String id)
	{
		return this.service.getLarge(Integer.parseInt(id));
	}
	
	@PostMapping("/large")
	public LargeImage addla(@RequestBody LargeImage img)
	{
		return this.service.addLarge(img);
	}
}
