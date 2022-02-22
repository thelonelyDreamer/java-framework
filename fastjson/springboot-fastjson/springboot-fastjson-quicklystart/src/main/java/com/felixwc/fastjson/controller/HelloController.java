package com.felixwc.fastjson.controller;

import com.felixwc.fastjson.pojo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/2/23 01:37
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/person")
    public Person getPerson(){
        Person person = new Person();
        person.setAge(12).setExist(false).setName("shine");
        return  person;
    }
}
