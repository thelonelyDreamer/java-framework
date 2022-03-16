package com.felixwc.sping.security.quickly.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/1 13:28
 *
 * @author wangchao
 */
@RestController
@RequestMapping("lv1")
@PreAuthorize("hasRole('lv1')")
public class Lv1Controller {

    @GetMapping("hello")
    public String sayHi(){
        return "hi";
    }

}
