package com.felixwc.springboot.swagger2.service;

import com.felixwc.springboot.swagger2.pojo.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * in order to learn java!
 * created at 2021/9/18 23:23
 *
 * @author wangchao
 */
@Service
public class UserService {

    public User getById(long id) {
        return new User(id,"虚拟用户"+id);
    }

    public List<User> getUsers(){
        LinkedList<User> users = new LinkedList<>();
        for(int i=0;i<100;i++) users.add(new User((long)i,"虚拟用户"+i));
        return users;
    }
}
