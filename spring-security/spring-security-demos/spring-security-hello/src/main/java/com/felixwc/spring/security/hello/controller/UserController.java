package com.felixwc.spring.security.hello.controller;

import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;
import com.felixwc.spring.security.hello.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/3/15 21:24
 *
 * @author wangchao
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }


    @RequestMapping("/safe/index")
    @ResponseBody
    public String getUserIndex(){
        return "/user/safe/index";
    }

    @PostMapping("/register")
    @ResponseBody
    public String registerUser(@RequestParam("username")String username,@RequestParam("password") String password,@RequestParam("role")Integer role){
        UserDBO userDBO = new UserDBO();
        userDBO.setUsername(username);
        userDBO.setPassword(passwordEncoder.encode(password));
        userDBO.setRole(role);
        userDBO.setId(userDBO.hashCode());
        userService.registerUser(userDBO);
        return "success";
    }

    @GetMapping("/all")
    @ResponseBody
    public List<UserDBO> getAllUser(){
        return userService.getAll() ;
    }

}
