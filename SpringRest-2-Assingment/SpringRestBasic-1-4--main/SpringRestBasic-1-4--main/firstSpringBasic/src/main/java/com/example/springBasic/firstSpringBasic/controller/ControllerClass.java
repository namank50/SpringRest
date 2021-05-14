package com.example.springBasic.firstSpringBasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBasic.firstSpringBasic.entities.Inventory;
import com.example.springBasic.firstSpringBasic.services.InventoryService;

@RestController
public class ControllerClass {
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping("/inventory")
	public List<Inventory> getInventories() {
		return this.inventoryService.getInventories();
	}
	
	@GetMapping("/inventory/{name}")
	public Inventory getOneInventory(@PathVariable String name ) {
		return this.inventoryService.getInventory(name);
	}
	
	@PostMapping("/inventory")
	public List<Inventory> addInventory(@RequestBody Inventory inventory ) {
		return this.inventoryService.addOneInventory(inventory);
	}
	
	@PutMapping("/inventory")
	public List<Inventory> updateInventories(@RequestBody List<Inventory> inventory ) {
		return this.inventoryService.updateAllInventory(inventory);
	}
	
	@PutMapping("/inventory/{name}")
	public List<Inventory> updateOneInventories(@PathVariable String name,@RequestBody Inventory inventory ) {
		return this.inventoryService.updateOneInventory(name,inventory);
	}
	
	@DeleteMapping("/inventory")
	public List<Inventory> deleteInventories() {
		return this.inventoryService.deleteAllInventory();
	}
	
	@DeleteMapping("/inventory/{name}")
	public List<Inventory> deleteOneInventories(@PathVariable String name) {
		return this.inventoryService.deleteOneInventory(name);
	}
}
