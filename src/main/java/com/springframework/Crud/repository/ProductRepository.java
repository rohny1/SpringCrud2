package com.springframework.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springframework.Crud.entity.Product;

public interface ProductRepository  extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}