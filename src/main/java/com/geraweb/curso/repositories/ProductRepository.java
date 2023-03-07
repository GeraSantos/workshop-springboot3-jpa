package com.geraweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geraweb.curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
