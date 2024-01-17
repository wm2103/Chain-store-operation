package com.example.storespringboot.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String role;
    private Integer storeid;
}
