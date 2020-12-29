package org.mybatis.example.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String userName;
    private String sex;
    private String address;
    private Date birthday;
}
