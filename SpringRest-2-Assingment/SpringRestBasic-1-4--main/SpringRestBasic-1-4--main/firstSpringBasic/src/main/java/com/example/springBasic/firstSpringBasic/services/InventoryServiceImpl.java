package com.example.springBasic.firstSpringBasic.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.springBasic.firstSpringBasic.entities.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService {

	List<Inventory> inventoryList = new ArrayList<>();;
	
	
	
	/*
	 * public InventoryServiceImpl() { // TODO Auto-generated constructor stub
	 * inventoryList = new ArrayList<>(); inventoryList.add(new
	 * Inventory("apples",29L)); inventoryList.add(new Inventory("oranges",82L));
	 * inventoryList.add(new Inventory("gauva",32L)); inventoryList.add(new
	 * Inventory("banana",22L)); inventoryList.add(new Inventory("watermelon",50L));
	 * 
	 * }
	 */



	@Override
	public List<Inventory> getInventories() {

		return this.inventoryList;
	}



	@Override
	public Inventory getInventory(String name) {
		// TODO Auto-generated method stub
		for(Inventory i : inventoryList)
			if(i.getName().matches(name))
				return i;
		return null;
	}



	@Override
	public List<Inventory> addOneInventory(Inventory inventory) {
		this.inventoryList.add(inventory);
		return inventoryList;
	}



	@Override
	public List<Inventory> updateAllInventory(List<Inventory> inventory) {
		this.inventoryList.clear();
		for(Inventory i : inventory)
			inventoryList.add(i);
		return inventoryList;
		
	}



	@Override
	public List<Inventory> updateOneInventory(String name, Inventory inventory) {
		for(Inventory i : inventoryList)
			if(i.getName().matches(name))
				{
				i.setQuantity(inventory.getQuantity());
				return inventoryList;
				}
		inventoryList.add(inventory);
		return inventoryList;
	}



	@Override
	public List<Inventory> deleteAllInventory() {
		inventoryList.clear();
		return inventoryList;
	}



	@Override
	public List<Inventory> deleteOneInventory(String name) {

		List<Inventory> n = new ArrayList<>();
		for(Inventory i : inventoryList)
			if(i.getName().matches(name))
				continue;
			else
				n.add(i);
		inventoryList.clear();
		inventoryList=n;
		
		return inventoryList;
	}
	
	
}
