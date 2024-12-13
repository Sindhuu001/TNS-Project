package com.example.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopping.entity.ItemEntity;
import com.example.shopping.repository.ItemRepository;

//Service class--> CURD moperations
//postman-->conroller-->service-->repository
@Service
public class ItemService {
@Autowired
public ItemRepository irep;

//post data(inserting the data into table)
public  ItemEntity additem(ItemEntity is) {
	return irep.save(is);
}
//get data
	public  List<ItemEntity>getitem(){
		return irep.findAll();
	}
	//delete data
	public void deleteitem(long id) {
		
		irep.deleteById(id);
	}
	//update data
	public ItemEntity updateitem(ItemEntity is) {
		return null;
	}
}