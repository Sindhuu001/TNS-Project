package com.example.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shopping.entity.ItemEntity;
public interface ItemRepository extends JpaRepository<ItemEntity,Long> {
}