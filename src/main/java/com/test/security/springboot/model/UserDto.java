package com.test.security.springboot.model;

import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
