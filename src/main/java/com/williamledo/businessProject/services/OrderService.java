package com.williamledo.businessProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamledo.businessProject.entities.Order;
import com.williamledo.businessProject.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		
		return repository.findAll();
		
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		return obj.get(); //Retorna o objeto do tipo, no caso Order, que está dentro do optional
	}
	
}
