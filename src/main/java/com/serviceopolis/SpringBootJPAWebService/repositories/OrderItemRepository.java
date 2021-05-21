package com.serviceopolis.SpringBootJPAWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviceopolis.SpringBootJPAWebService.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
