package com.surfersolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surfersolution.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
