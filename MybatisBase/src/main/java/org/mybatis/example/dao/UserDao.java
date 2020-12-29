package org.mybatis.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.example.entity.User;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> findAll();
}
