package com.geraweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geraweb.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
