package com.williamledo.businessProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.businessProject.entities.OrderItem;
 
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
