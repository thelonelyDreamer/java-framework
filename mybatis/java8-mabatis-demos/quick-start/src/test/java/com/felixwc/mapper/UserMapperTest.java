package com.felixwc.mapper;

import com.felixwc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

public class UserMapperTest {
    private final String CONFIG_NAME = "mybatis-config.xml";
    @Test
    public void test1() throws IOException {
        InputStream is = Resources.getResourceAsStream(CONFIG_NAME);
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
    }

    @Test
    public void test2() throws IOException{
        InputStream resourceAsStream = Resources.getResourceAsStream(CONFIG_NAME);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String s = String.valueOf(Math.random());
        int i = mapper.insertUser(new User().setUserName(s).setPassword(s));
        sqlSession.commit();
        System.out.println(i);
    }

    @Test
    public void test3()throws IOException{
        InputStream resourceAsStream = Resources.getResourceAsStream(CONFIG_NAME);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (int i = 0; i < 6; i++) {
            User user = mapper.getUserById(new Random().nextInt(5) + 1);
            System.out.println(user);
        }
    }
}