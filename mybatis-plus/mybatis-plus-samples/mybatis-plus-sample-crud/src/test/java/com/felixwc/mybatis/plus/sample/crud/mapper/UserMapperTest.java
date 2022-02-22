package com.felixwc.mybatis.plus.sample.crud.mapper;

import com.felixwc.mybatis.plus.sample.crud.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void test(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

    @Test
    public void baseMapperMethod(){

    }
}