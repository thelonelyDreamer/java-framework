package com.felixwc.dao;

import com.felixwc.pojo.PersonDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
@SpringBootTest("application-test.yml")
class CRUDPersonRepoTest {
    @Autowired
    private CRUDPersonRepo repo;

    @Test
    void test() {
        PersonDo personDo = new PersonDo();
        personDo.setName("shine");
        personDo.setPassword("123");
        PersonDo save = repo.save(personDo);
        System.out.println(save);
    }

    @Test
    void test1(){
        Optional<PersonDo> byId = repo.findById(1L);
        System.out.println(byId.get());
    }

    @Test
    void test2(){
        System.out.println(repo.count());
        System.out.println(repo.countDistinctByNameEquals("shine"));
    }
}