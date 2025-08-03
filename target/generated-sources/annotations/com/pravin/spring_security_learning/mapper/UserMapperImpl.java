package com.pravin.spring_security_learning.mapper;

import com.pravin.spring_security_learning.dto.UserDTO;
import com.pravin.spring_security_learning.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-03T09:11:45+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250729-0351, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setPassword( dto.getPassword() );
        user.setRole( dto.getRole() );
        user.setUsername( dto.getUsername() );

        return user;
    }

    @Override
    public UserDTO toDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setPassword( entity.getPassword() );
        userDTO.setRole( entity.getRole() );
        userDTO.setUsername( entity.getUsername() );

        return userDTO;
    }
}
