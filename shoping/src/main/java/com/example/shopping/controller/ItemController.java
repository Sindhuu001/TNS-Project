package com.example.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopping.entity.ItemEntity;
import com.example.shopping.service.ItemService;
@RestController
public class ItemController {

	@Autowired
	public ItemService item;
	
	@PostMapping("/aitem")
	public ItemEntity regItem(@RequestBody ItemEntity IS) {
		return item.additem(IS);
	}
	@GetMapping("/gitem")
	public List<ItemEntity> getitem() {
		return item.getitem();
	}
	@DeleteMapping("/ditem/{id}")
	public void deleteitem(@PathVariable long id) {
		item.deleteitem(id);
	}
	@PutMapping("/uitem")
	public ItemEntity updateitem(@RequestBody ItemEntity IS) {
		return item.updateitem(IS);
	}
}