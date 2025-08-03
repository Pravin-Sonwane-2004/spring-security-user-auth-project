package com.pravin.spring_security_learning.service;

import org.springframework.stereotype.Service;

import com.pravin.spring_security_learning.dto.UserDTO;
import com.pravin.spring_security_learning.entity.User;
import com.pravin.spring_security_learning.mapper.UserMapper;
import com.pravin.spring_security_learning.repository.UserRepository;

@Service
public class UserService {
  
  private final UserRepository userepository;
  private final UserMapper userMapper;


  public UserService(UserRepository userRepository, UserMapper userMapper) {
    this.userepository = userRepository;
    this.userMapper = userMapper;
  }

  //actual impl
  public  User createUser(UserDTO userDTO) {
    User user = userMapper.toEntity(userDTO);
    return userepository.save(user);
  }

}
