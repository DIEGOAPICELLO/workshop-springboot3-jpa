package com.mburn.courseSpring.repositories;

import com.mburn.courseSpring.entities.OrderItem;
import com.mburn.courseSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
