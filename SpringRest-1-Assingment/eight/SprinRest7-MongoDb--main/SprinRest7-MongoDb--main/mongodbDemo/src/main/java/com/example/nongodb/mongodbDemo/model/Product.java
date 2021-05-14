package com.example.nongodb.mongodbDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import sun.util.calendar.BaseCalendar.Date;



@Document(collection = "Products")
public class Product{
  
	@Id
	private int id;
	private String name;
	private float cost;
	public Product(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	

}
