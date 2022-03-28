package com.williamledo.businessProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.businessProject.entities.Product;
 
public interface ProductRepository extends JpaRepository<Product, Long>{

}
