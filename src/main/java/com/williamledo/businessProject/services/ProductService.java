package com.williamledo.businessProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamledo.businessProject.entities.Product;
import com.williamledo.businessProject.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		
		return repository.findAll();
		
	}
	
	public Product findById(Long id) {
		
		Optional<Product> obj = repository.findById(id);
		return obj.get(); //Retorna o objeto do tipo, no caso Product, que está dentro do optional
	}
	
}
