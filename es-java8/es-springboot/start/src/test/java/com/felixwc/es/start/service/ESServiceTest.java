package com.felixwc.es.start.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ESServiceTest {
    @Autowired
    ESService esService;

    @Test
    void test1() throws IOException {
//        System.out.println(esService==null);
//        esService.test1();
    }
}