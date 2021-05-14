package com.example.ninth.customer.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ninth.customer.Service.CustomerService;
import com.example.ninth.customer.entity.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/employee")
	public List<Customer> getCustomer() {
		return this.customerService.getCustomer();
	}
	
	@GetMapping("/employee/{id}")
	public Customer getOneCustomer(@PathVariable int id ) {
		return this.customerService.getOneCustomer(id);
	}
	
	@PostMapping("/employee")
	public List<Customer> addCustomer(@RequestBody Customer customer ) {
		return this.customerService.addOneCustomer(customer);
	}
	
	
	@PutMapping("/employee/{id}")
	public List<Customer> updateOneCustomer(@PathVariable int id,@RequestBody Customer customer ) {
		return this.customerService.updateOneCustomer(id,customer);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public List<Customer> deleteOneCustomer(@PathVariable int id) {
		return this.customerService.deleteOneCustomer(id);
	}
	

}
