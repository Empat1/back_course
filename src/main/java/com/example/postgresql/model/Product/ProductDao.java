package com.example.postgresql.model.Product;

import com.example.postgresql.model.Product.Product;
import com.example.postgresql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDao {

    @Autowired
    private ProductRepository repository;

    public Product save(Product employee) {
        return repository.save(employee);
    }

    public List<Product> getAllEmployees() {
        List<Product> products = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(products::add);
        return products;
    }

    public void delete(long productId) {
        repository.deleteById(productId);
    }
}
