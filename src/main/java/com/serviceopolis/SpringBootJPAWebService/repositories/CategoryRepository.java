package com.serviceopolis.SpringBootJPAWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviceopolis.SpringBootJPAWebService.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
