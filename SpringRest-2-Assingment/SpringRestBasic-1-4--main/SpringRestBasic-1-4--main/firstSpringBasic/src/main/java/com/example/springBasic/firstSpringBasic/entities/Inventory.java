package com.example.springBasic.firstSpringBasic.entities;

public class Inventory {
	
	private String name;
	private Long quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Inventory(String name, Long quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Inventory [name=" + name + ", quantity=" + quantity + "]";
	}
	
	
	

}
