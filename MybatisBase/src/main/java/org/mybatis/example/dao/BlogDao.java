package org.mybatis.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.example.entity.Blog;

@Mapper
public interface BlogDao {
    Blog findBlog(int id);
}
