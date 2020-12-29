package org.mybatis.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.example.entity.AccountUser;

import java.util.List;

@Mapper
public interface AccountDao {
    List<AccountUser> findAll();
}
