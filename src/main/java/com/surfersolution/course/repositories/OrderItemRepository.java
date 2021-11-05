package com.surfersolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surfersolution.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
