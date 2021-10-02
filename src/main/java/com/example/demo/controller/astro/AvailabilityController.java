//package com.example.demo.controller.astro;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.entity.astro.Availability;
//import com.example.demo.service.AvailabilityServiceImpl;
//
//
//@RestController
//@RequestMapping("/avail")
//public class AvailabilityController {
//
//	@Autowired
//	private AvailabilityServiceImpl serviceavail;
//	
//	@GetMapping("/{id}")
//	public Availability get(@PathVariable String id)
//	{
//		return this.serviceavail.getAvail(Integer.parseInt(id));
//	}
//	
//	@PostMapping
//	public Availability addavail(@RequestBody Availability avail)
//	{
//		return this.serviceavail.addavailability(avail);
//	}
//	
//}
