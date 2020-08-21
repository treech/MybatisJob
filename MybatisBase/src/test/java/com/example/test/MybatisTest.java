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
import java.util.List;

public class MybatisTest {

    InputStream is;
    SqlSession sqlSession;
    BlogDao blogDao;

    @Test
    public void testFind() throws IOException {
        init();
        //query
        List<Blog> blogs = blogDao.findAll();
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        close();
    }

    @Test
    public void testFindByName() throws IOException {
        init();
        //query
        List<Blog> blogs = blogDao.findByName("典");
        for (Blog blog : blogs) {
            System.out.println("打印结果:" + blog);
        }
        close();
    }

    @Test
    public void testAdd() throws IOException {
        init();
        //insert
        Blog addBlog = new Blog();
        addBlog.setName("典韦");
        System.out.println("添加前:"+addBlog);
        blogDao.addBlog(addBlog);
        sqlSession.commit();
        System.out.println("添加后:"+addBlog);
        close();
    }

    @Test
    public void testDelete() throws IOException {
        init();
        //delete
        blogDao.deleteById(13);
        sqlSession.commit();
        close();
    }

    @Test
    public void testUpdate() throws IOException {
        init();
        //update
        Blog updateBlog = new Blog();
        updateBlog.setId(2);
        updateBlog.setName("韩信");
        blogDao.updateBlog(updateBlog);
        sqlSession.commit();
        close();
    }

    private void init() throws IOException {
        is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        blogDao = sqlSession.getMapper(BlogDao.class);
    }

    private void close() throws IOException {
        sqlSession.close();
        is.close();
    }
}
