package com.serviceopolis.SpringBootJPAWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviceopolis.SpringBootJPAWebService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
