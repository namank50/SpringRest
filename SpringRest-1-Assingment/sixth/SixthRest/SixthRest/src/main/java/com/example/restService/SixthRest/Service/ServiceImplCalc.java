package com.example.restService.SixthRest.Service;

import org.springframework.stereotype.Service;

import com.example.restService.SixthRest.Entity.Numbers;
@Service
public class ServiceImplCalc implements serviceImpl {

	@Override
	public int add(Numbers num) {
		// TODO Auto-generated method stub
		return num.getN1()+num.getN2();
	}

	@Override
	public int subtract(Numbers num) {
		// TODO Auto-generated method stub
		return num.getN1()-num.getN2();
	}

	@Override
	public int multiply(Numbers num) {
		// TODO Auto-generated method stub
		return num.getN1()*num.getN2();
	}

	@Override
	public int devide(Numbers num) {
		// TODO Auto-generated method stub
		return num.getN1()/num.getN2();
	}

	@Override
	public double sqrt(int n1) {
		// TODO Auto-generated method stub
		return Math.sqrt(n1);
	}

	
}
