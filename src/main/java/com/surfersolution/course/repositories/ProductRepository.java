package com.surfersolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surfersolution.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
