package com.pravin.spring_security_learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravin.spring_security_learning.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

  Object save(org.springframework.boot.autoconfigure.security.SecurityProperties.User user);
  
}
