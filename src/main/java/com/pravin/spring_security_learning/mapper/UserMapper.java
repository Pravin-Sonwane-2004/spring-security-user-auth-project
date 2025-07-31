package com.pravin.spring_security_learning.mapper;

import org.mapstruct.Mapper;

import com.pravin.spring_security_learning.dto.UserDTO;
import com.pravin.spring_security_learning.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO dto);     // ✅ Your entity
    UserDTO toDto(User entity);     // ✅ Mapping back to DTO
}
