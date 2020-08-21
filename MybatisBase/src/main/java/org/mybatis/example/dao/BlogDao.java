package org.mybatis.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.example.entity.Blog;

import java.util.List;

@Mapper
public interface BlogDao {
    Blog findBlog(int id);

    List<Blog> findAll();

    void addBlog(Blog blog);

    void updateBlog(Blog blog);

    void deleteById(int id);
}
