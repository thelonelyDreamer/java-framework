package com.felixwc.mybatis.plus.quickstart.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonMapperTest {
    @Autowired
    private PersonMapper personMapper;
    @Test
    public void testQueryById(){
        personMapper.selectById(1L);
    }
}