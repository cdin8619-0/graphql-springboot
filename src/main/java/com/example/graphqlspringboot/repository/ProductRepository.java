package com.example.graphqlspringboot.repository;

import com.example.graphqlspringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class ProductRepository extends JpaRepository<Product, Integer> {

    public List<Product> findByCategory(String category) {
        return null;
    }
}
