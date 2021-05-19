package com.serviceopolis.SpringBootJPAWebService.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.serviceopolis.SpringBootJPAWebService.entities.Order;
import com.serviceopolis.SpringBootJPAWebService.entities.User;
import com.serviceopolis.SpringBootJPAWebService.repositories.OrderRepository;
import com.serviceopolis.SpringBootJPAWebService.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private OrderRepository orderRepo;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Rudolph", "rudy@gmail.com", "5549999999", "12345");
		User u2 = new User(null, "Mr. Potato Roosevelt", "potato@gmail.com", "5549966778", "76543");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepo.saveAll(Arrays.asList(u1, u2));
		orderRepo.saveAll(Arrays.asList(o1, o2, o3));
		
	}

}
