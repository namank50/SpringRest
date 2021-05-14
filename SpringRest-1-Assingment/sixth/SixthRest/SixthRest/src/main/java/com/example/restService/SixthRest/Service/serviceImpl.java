package com.example.restService.SixthRest.Service;

import org.springframework.stereotype.Service;

import com.example.restService.SixthRest.Entity.Numbers;
@Service
public interface serviceImpl {

	public int add(Numbers num);
	public int subtract(Numbers num);
	public int multiply(Numbers num);
	public int devide(Numbers num);
	public double sqrt(int n1);
	
}
