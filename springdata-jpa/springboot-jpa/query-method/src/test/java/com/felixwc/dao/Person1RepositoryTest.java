package com.felixwc.dao;

import com.felixwc.pojo.Person1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class Person1RepositoryTest {
    @Autowired
    Person1Repository repository;

    @Test
    public void test(){
        ArrayList<Person1> person1s = new ArrayList<Person1>();
        for(int i =1;i<10;i++){
            person1s.add(new Person1());
        }
        repository.saveAll(person1s);
        for (Person1 person1 : repository.findAll()) {
            System.out.println(person1);
        }

    }

    @Test
    public void test1(){
        List<Person1> person1s = repository.findPerson1ByAgeLessThan(1);
        person1s.stream().forEach(System.out::println);
    }
}