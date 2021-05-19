package com.serviceopolis.SpringBootJPAWebService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceopolis.SpringBootJPAWebService.entities.User;
import com.serviceopolis.SpringBootJPAWebService.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repo.findById(id);
		return user.get();
	}
}
