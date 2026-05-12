package com.pravin.spring_security_learning.mapper;

import com.pravin.spring_security_learning.dto.UserDTO;
import com.pravin.spring_security_learning.dto.UserLoginDTO;
import com.pravin.spring_security_learning.dto.toLoginEntity;
import com.pravin.spring_security_learning.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-13T01:14:44+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( dto.getUsername() );
        user.setPassword( dto.getPassword() );
        user.setRole( dto.getRole() );

        return user;
    }

    @Override
    public UserDTO toDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setUsername( entity.getUsername() );
        userDTO.setPassword( entity.getPassword() );
        userDTO.setRole( entity.getRole() );

        return userDTO;
    }

    @Override
    public UserLoginDTO toLoginDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserLoginDTO userLoginDTO = new UserLoginDTO();

        userLoginDTO.setUsername( entity.getUsername() );
        userLoginDTO.setPassword( entity.getPassword() );
        userLoginDTO.setRole( entity.getRole() );

        return userLoginDTO;
    }

    @Override
    public User toLoginEntity(toLoginEntity dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( dto.getUsername() );
        user.setPassword( dto.getPassword() );
        user.setRole( dto.getRole() );

        return user;
    }
}
