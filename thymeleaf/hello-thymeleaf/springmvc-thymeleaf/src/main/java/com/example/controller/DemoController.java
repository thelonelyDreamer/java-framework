package com.example.controller;

import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/4/20 12:24
 *
 * @author felixwc
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/page1")
    public String test1(Model model){
        System.out.println("page1");
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test3");
        model.addAttribute("tests",strings);
        model.addAttribute("message","test");
        return "demo/page1";
    }

    @RequestMapping("/page")
    public String test(Model model){
        User user = new User();
        user.setAge(19);
        user.setUsername("zhangsan");
        model.addAttribute("user",user);
        model.addAttribute("date",new Date());
        return "demo/page";
    }
}
