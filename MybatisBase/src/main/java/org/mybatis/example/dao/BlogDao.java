package org.mybatis.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.example.entity.Blog;
import org.mybatis.example.entity.QueryVo;

import java.util.List;

@Mapper
public interface BlogDao {
    Blog findBlog(int id);

    List<Blog> findAll();

    List<Blog> findByName(String name);

    List<Blog> findByCondition(Blog blog);

    List<Blog> findByIds(QueryVo queryVo);

    void addBlog(Blog blog);

    void updateBlog(Blog blog);

    void deleteById(int id);
}
