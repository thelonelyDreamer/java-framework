package org.example.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * in order to learn java!
 * created at 2022/6/13 18:10
 *
 * @author felixwc
 */
@Service
public class HelloServiceImpl {

    @Cacheable(value = {"user","user1"},key = "#name")
    public String test(String name){
        System.out.println("test in helloServiceImpl");
        return name;
    }
}
