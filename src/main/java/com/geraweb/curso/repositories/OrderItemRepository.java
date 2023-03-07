package com.geraweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geraweb.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
