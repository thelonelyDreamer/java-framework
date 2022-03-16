package com.felixwc.spring.security.hello.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2021/3/15 20:56
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("lv0")
    @PreAuthorize("hasRole('lv0')")
    public String lv0(){
        return "lv0等级用户访问";
    }
}
