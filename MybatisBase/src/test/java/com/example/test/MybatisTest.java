package com.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.example.dao.BlogDao;
import org.mybatis.example.entity.Blog;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    @Test
    public void testFind() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BlogDao blogDao = sqlSession.getMapper(BlogDao.class);
        Blog blog = blogDao.findBlog(1);
        System.out.println(blog);
        sqlSession.close();
        is.close();
    }
}
