package com.williamledo.businessProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamledo.businessProject.entities.Category;
import com.williamledo.businessProject.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		
		Optional<Category> obj = repository.findById(id);
		return obj.get(); //Retorna o objeto do tipo, no caso Category, que está dentro do optional
	}
	
}
