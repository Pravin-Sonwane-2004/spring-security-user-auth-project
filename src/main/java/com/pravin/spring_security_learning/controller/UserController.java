package com.pravin.spring_security_learning.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pravin.spring_security_learning.dto.UserDTO;
import com.pravin.spring_security_learning.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
  
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }
    
  @PostMapping("/createuser")
  public ResponseEntity<String> postMethodName(@RequestBody UserDTO userDTO) {
    userService.createUser(userDTO);      
    return ResponseEntity.ok("User created successfully");
  }
  
}
