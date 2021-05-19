package com.serviceopolis.SpringBootJPAWebService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceopolis.SpringBootJPAWebService.entities.Order;
import com.serviceopolis.SpringBootJPAWebService.entities.User;
import com.serviceopolis.SpringBootJPAWebService.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;
	
	public List<Order> findAll() {
		return repo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> order = repo.findById(id);
		return order.get();
	}
}
