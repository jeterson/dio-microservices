package com.jeterson.dio.productcatalog.repositories;

import java.util.List;

import com.jeterson.dio.productcatalog.model.Product;

import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Integer>{
    
    List<Product> findByName(String name);
}
