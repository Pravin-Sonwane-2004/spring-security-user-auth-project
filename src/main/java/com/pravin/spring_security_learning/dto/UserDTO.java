package com.pravin.spring_security_learning.dto;


import com.pravin.spring_security_learning.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
  
    private String Username;
    private String Password;
    private Role role;
}
