package com.mateus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
