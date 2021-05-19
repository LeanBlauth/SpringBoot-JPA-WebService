package com.serviceopolis.SpringBootJPAWebService.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.serviceopolis.SpringBootJPAWebService.entities.Category;
import com.serviceopolis.SpringBootJPAWebService.entities.Order;
import com.serviceopolis.SpringBootJPAWebService.entities.Product;
import com.serviceopolis.SpringBootJPAWebService.entities.User;
import com.serviceopolis.SpringBootJPAWebService.entities.enums.OrderStatus;
import com.serviceopolis.SpringBootJPAWebService.repositories.CategoryRepository;
import com.serviceopolis.SpringBootJPAWebService.repositories.OrderRepository;
import com.serviceopolis.SpringBootJPAWebService.repositories.ProductRepository;
import com.serviceopolis.SpringBootJPAWebService.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private OrderRepository orderRepo;
	@Autowired
	private CategoryRepository categoryRepo;
	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "spaceToilet");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		Category cat4 = new Category(null, "Spices and Greens");
		
		Product p1 = new Product(null, "Green Tea", "Gen Mai Cha Kyoto Green Tea", 50.0, "");
		Product p2 = new Product(null, "Beyond Order: 12 More Rules for Life", "Peterson, Jordan B. ; 2021", 17.40, "");
		Product p3 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p4 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p5 = new Product(null, "Philly Series 5", "Philadelphia Cheese PS5 shaped", 4.99, "");

		User u1 = new User(null, "Rudolph", "rudy@gmail.com", "5549999999", "12345");
		User u2 = new User(null, "Mr. Potato Roosevelt", "potato@gmail.com", "5549966778", "76543");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.SHIPPED, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1);
		
		categoryRepo.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepo.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		userRepo.saveAll(Arrays.asList(u1, u2));
		orderRepo.saveAll(Arrays.asList(o1, o2, o3));
		
	}

}
