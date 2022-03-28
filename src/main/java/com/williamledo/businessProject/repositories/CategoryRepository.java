package com.williamledo.businessProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.businessProject.entities.Category;
 
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
