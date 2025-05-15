package com.example.graphqlspringboot.repository;

import com.example.graphqlspringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository extends JpaRepository<Product, Integer> {

    public List<Product> findByCategory(String category) {
        return null;
    }
}
