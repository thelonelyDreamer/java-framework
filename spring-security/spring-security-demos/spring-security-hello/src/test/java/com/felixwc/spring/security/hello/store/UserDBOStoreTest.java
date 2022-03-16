package com.felixwc.spring.security.hello.store;

import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserDBOStoreTest {
    @Autowired
    private UserDBOStore store;

    @Test
    public void addUserTest(){
        UserDBO userDBO = new UserDBO();
        userDBO.setId(1);
        store.addUser(userDBO);
        store.getAllUser().forEach(System.out::println);
    }
}