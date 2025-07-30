package com.pravin.spring_security_learning.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
  
    private String Username;
    private String Password;
}
