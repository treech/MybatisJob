package org.mybatis.example.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private Integer id;
    private String userName;
    private String sex;
    private String address;
    private Date birthday;
    private List<Account> accounts;
}
