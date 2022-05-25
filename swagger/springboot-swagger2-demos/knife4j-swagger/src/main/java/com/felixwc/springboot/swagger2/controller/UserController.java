package com.felixwc.springboot.swagger2.controller;

import com.felixwc.springboot.swagger2.pojo.User;
import com.felixwc.springboot.swagger2.service.UserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/9/18 23:22
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户类")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    @ApiImplicitParam(value = "用户id",name = "id")
    public User getUserById(@PathVariable("id") long id){
        return userService.getById(id);
    }
    @GetMapping("/all")
    @ApiOperation(value = "获取全部用户")
    @ApiResponses({
            @ApiResponse(code = 200,message = "成功"),
            @ApiResponse(code = 404,message = "找不到路径")
    })
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
