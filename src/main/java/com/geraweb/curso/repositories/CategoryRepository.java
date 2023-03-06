package com.geraweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geraweb.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
