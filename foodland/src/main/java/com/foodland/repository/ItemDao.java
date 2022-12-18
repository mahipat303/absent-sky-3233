package com.foodland.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foodland.model.Item;

@Repository
public interface ItemDao extends JpaRepository<Item,Integer>{
	public List<Item> findByName(String name);
}
