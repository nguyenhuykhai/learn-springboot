package com.learn.springboot.Learn.Springboot.repositories;

import com.learn.springboot.Learn.Springboot.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductName(String productName);
}
