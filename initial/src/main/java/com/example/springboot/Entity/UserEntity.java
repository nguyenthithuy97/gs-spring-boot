package com.example.springboot.Entity;

import lombok.Data;

@Data
public class UserEntity {

    // user id
    private Integer id;
    // user name
    private String name;
    // user password;
    private String password;

    public String toString() {
        return String.format("Welcome %s", this.getName());
    }
}
