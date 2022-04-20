package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/4/20 12:47
 *
 * @author felixwc
 */
@RestController
public class HelloController {
    @RequestMapping("/hi")
    public String test1(){
        return "hello";
    }
}
