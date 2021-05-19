package com.serviceopolis.SpringBootJPAWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviceopolis.SpringBootJPAWebService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
