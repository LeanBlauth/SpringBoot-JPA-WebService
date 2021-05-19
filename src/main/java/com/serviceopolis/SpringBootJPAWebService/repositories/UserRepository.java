package com.serviceopolis.SpringBootJPAWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviceopolis.SpringBootJPAWebService.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
