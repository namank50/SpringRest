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
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/addproduct")
	public String saveBook(@RequestBody Product product) {
		System.out.println(product);
		repository.save(product);
		return "Added book with id:";
	}
	
	@GetMapping("/getproduct")
	public List<Product> getBooks(){
		
		return repository.findAll();
		
	}
	
	@GetMapping("/getproduct/{id}")
	public Optional<Product> getBooks(@PathVariable int id){
		return repository.findById(id);	
	}
	
	@PutMapping("/updateproduct/{id}")
	public String update(@PathVariable int id,@RequestBody Product order) {
		repository.save(order);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public String delete(@PathVariable int id,@RequestBody Product order) {
		repository.deleteById(id);
		return "Deleted Successfully";
	}
	
	
}
