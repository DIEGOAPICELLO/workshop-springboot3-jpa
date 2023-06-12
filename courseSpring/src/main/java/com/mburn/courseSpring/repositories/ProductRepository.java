package com.mburn.courseSpring.repositories;

import com.mburn.courseSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
