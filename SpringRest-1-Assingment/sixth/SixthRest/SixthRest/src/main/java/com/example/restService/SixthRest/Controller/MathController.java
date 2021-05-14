package com.example.restService.SixthRest.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restService.SixthRest.Entity.Numbers;
import com.example.restService.SixthRest.Service.serviceImpl;

@RestController
public class MathController {

	@Autowired
	serviceImpl s;
	
	@PostMapping("/add")
	public int add(@RequestBody Numbers num)
	{
		
		return 	s.add(num);
	}
	
	@PostMapping("/multiply")
	public int multiply(@RequestBody Numbers num)
	{
		return s.multiply(num);	
	}
	
	@PostMapping("/devide")
	public float devide(@RequestBody Numbers num)
	{
		return s.devide(num);	
	}
	
	@PostMapping("/subtract")
	public int subtract(@RequestBody Numbers num)
	{
		return s.subtract(num);	
	}
	
	@PostMapping("/sqrt")
	public double squareRoot(@RequestBody int n1)
	{
		return s.sqrt(n1);	
	}
	
	
}
