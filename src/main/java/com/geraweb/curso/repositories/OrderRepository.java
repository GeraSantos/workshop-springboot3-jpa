package com.geraweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geraweb.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
