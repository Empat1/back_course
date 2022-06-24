package com.example.postgresql.controller;

import com.example.postgresql.model.Product.Product;
import com.example.postgresql.model.Product.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/product/get-all")
    public List<Product> getAllProducts() {
        return productDao.getAllEmployees();
    }

    @PostMapping("/product/save")
    public Product save(@RequestBody Product product) {
        return productDao.save(product);
    }
}
