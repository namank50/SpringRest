package com.example.nongodb.mongodbDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import sun.util.calendar.BaseCalendar.Date;



@Document(collection = "Order")
public class Order {

	@Id
	private int id;
	private float total;
	private Customer customer;
	public Order(int id, float total, Customer customer) {
		super();
		this.id = id;
		this.total = total;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", total=" + total + ", customer=" + customer + "]";
	}


}