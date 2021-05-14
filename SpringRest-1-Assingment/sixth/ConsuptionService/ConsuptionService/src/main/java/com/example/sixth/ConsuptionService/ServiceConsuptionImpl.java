package com.example.sixth.ConsuptionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceConsuptionImpl {
	@Autowired
	private ServiceConsuption s;

	@PostMapping("/addc")
	public int addC(Numbers num) {
		return s.add(num);
		
	}
	
	@PostMapping("/subc")
	public int subtractC(Numbers num) {
		return s.subtract(num);
		
	}
	
	@PostMapping("/devidec")
	public int devideC(Numbers num) {
		return s.devide(num);
		
	}
	
	@PostMapping("/multiplyc")
	public int multiplyC(Numbers num) {
		return s.multiply(num);
		
	}
	
	@PostMapping("/sqrtc")
	public int sqrtC(int num) {
		return s.sqrt(num);
		
	}
}
