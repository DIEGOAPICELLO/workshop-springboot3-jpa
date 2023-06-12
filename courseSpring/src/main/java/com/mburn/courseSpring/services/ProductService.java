package com.mburn.courseSpring.services;

import com.mburn.courseSpring.entities.Product;
import com.mburn.courseSpring.repositories.ProductRepository;
import com.mburn.courseSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findbyId(long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
