package com.example.nongodb.mongodbDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.nongodb.mongodbDemo.model.Order;
import com.example.nongodb.mongodbDemo.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
