package com.example.springBasic.firstSpringBasic.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springBasic.firstSpringBasic.entities.Inventory;

@Service
public interface InventoryService {
	
	public List<Inventory> getInventories();

	public Inventory getInventory(String name);

	public List<Inventory> addOneInventory(Inventory inventory);

	public List<Inventory> updateAllInventory(List<Inventory> inventory);

	public List<Inventory> updateOneInventory(String name, Inventory inventory);

	public List<Inventory> deleteAllInventory();

	public List<Inventory> deleteOneInventory(String name);
	

}
