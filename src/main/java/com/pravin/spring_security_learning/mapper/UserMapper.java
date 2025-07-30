package com.pravin.spring_security_learning.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.pravin.spring_security_learning.dto.UserDTO;
import com.pravin.spring_security_learning.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

      UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

      org.springframework.boot.autoconfigure.security.SecurityProperties.User toEntity(UserDTO dto);

      UserDTO toDto(User entity);
      
}
