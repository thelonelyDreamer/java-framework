package com.felixwc.spring.security.hello.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/2/28 19:14
 *
 * @author wangchao
 */
@RestController
@RequestMapping("lv1")
@PreAuthorize("hasRole('lv1')")
public class Lv1Controller {
    @GetMapping("ping")
    public String pong(){
        return "pong";
    }

}
