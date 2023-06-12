package com.mburn.courseSpring.services;

import com.mburn.courseSpring.entities.Category;
import com.mburn.courseSpring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findbyId(long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
