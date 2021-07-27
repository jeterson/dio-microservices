package com.jeterson.dio.productcatalog.services;

import java.util.List;
import java.util.Optional;

import com.jeterson.dio.productcatalog.model.Product;
import com.jeterson.dio.productcatalog.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public Product create(Product product) {
        return repository.save(product);
    }
    public Product update(Integer id, Product product) {
        product.setId(id);
        return repository.save(product);
    }
    public void delete(Integer id) {
        repository.deleteById(id);
    }
    public Optional<Product> findById(Integer id) {
        return repository.findById(id);
    }
    public Iterable<Product> findAll() {
        return repository.findAll();
    }
    public List<Product> findByName(String name) {
        return repository.findByName(name);
    }
}
