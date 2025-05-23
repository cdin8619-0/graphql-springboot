package com.example.graphqlspringboot.controller;

import com.example.graphqlspringboot.entity.Product;
import com.example.graphqlspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @QueryMapping
    public List<Product> getProductsByCategory(@Argument String category) {
        return productService.getProductsByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument int productId, @Argument int stock) {
        return productService.updateStock(productId, stock);
    }

    @MutationMapping
    public Product receiveNewShipment(@Argument int productId, @Argument int quantity) {
        return productService.receiveNewShipment(productId, quantity);
    }
}
