package com.pravin.spring_security_learning.mapper;

import com.pravin.spring_security_learning.dto.UserDTO;
import com.pravin.spring_security_learning.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-31T10:35:20+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250628-1110, environment: Java 21.0.7 (Eclipse Adoptium)"
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
        userDTO.setUsername( entity.getUsername() );

        return userDTO;
    }
}
