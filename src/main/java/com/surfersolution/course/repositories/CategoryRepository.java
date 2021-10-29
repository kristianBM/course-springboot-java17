package com.surfersolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surfersolution.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
