package org.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceImplTest {
    @Autowired
    private HelloServiceImpl helloService;
    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            helloService.test("a");
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}