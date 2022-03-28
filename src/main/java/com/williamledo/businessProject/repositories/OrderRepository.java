package com.williamledo.businessProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.businessProject.entities.Order;
 
public interface OrderRepository extends JpaRepository<Order, Long>{

}
