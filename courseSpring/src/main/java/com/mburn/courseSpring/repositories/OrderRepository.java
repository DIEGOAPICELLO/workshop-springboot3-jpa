package com.mburn.courseSpring.repositories;

import com.mburn.courseSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
