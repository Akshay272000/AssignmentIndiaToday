package com.example.demo.controller.astro;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.astro.astro;
import com.example.demo.service.astro.astroService;

@RestController
@RequestMapping("/astro")
public class astroController {

	@Autowired
	private astroService AstroService;
	
	   @GetMapping("/{id}")
	   public astro getastro(@PathVariable int id)
	   {
		 
		   return this.AstroService.getAstro(id);
		   
	   }
	
	
	   @PostMapping
	   public astro addastro(@RequestBody astro astro1)
	   {
		   return this.AstroService.addAstro(astro1);
	   }
	
	
}
