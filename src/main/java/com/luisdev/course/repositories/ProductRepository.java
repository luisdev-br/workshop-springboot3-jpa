package com.luisdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
