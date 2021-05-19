package com.serviceopolis.SpringBootJPAWebService.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.serviceopolis.SpringBootJPAWebService.entities.User;
import com.serviceopolis.SpringBootJPAWebService.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Rudolph", "rudy@gmail.com", "5549999999", "12345");
		User u2 = new User(null, "Mr. Potato Roosevelt", "potato@gmail.com", "5549966778", "76543");
		
		userRepo.saveAll(Arrays.asList(u1, u2));
		
	}

}
