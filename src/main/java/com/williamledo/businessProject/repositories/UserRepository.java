package com.williamledo.businessProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.businessProject.entities.User;
 
public interface UserRepository extends JpaRepository<User, Long>{

}
