package com.example.nongodb.mongodbDemo.controller;

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

import com.example.nongodb.mongodbDemo.model.BookStore;
import com.example.nongodb.mongodbDemo.model.Order;
import com.example.nongodb.mongodbDemo.model.Product;
import com.example.nongodb.mongodbDemo.repository.OrderRepository;
import com.example.nongodb.mongodbDemo.repository.ProductRepository;

@RestController
 public class BookController { 

	@Autowired
	private OrderRepository repository;
	
	@PostMapping("/addorder")
	public String saveBook(@RequestBody Order order) {
		System.out.println(order);
		repository.save(order);
		return "Added book with id:";
	}
	
	@GetMapping("/getorder")
	public List<Order> getBooks(){
		
		return repository.findAll();
		
	}
	
	@GetMapping("/getorder/{id}")
	public Optional<Order> getBooks(@PathVariable int id){
		return repository.findById(id);	
	}
	
	@PutMapping("/updateorder/{id}")
	public String update(@PathVariable int id,@RequestBody Order order) {
		repository.save(order);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/deleteorder/{id}")
	public String delete(@PathVariable int id,@RequestBody Order order) {
		repository.deleteById(id);
		return "Deleted Successfully";
	}
	
	
}
