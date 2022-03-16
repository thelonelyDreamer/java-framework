package com.felixwc.spring.security.hello.service.impl;

import com.felixwc.spring.security.hello.mapper.UserDBOMapper;
import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;
import com.felixwc.spring.security.hello.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/3/15 22:30
 *
 * @author wangchao
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserDBOMapper userMapper;

    @Autowired
    public UserServiceImpl(UserDBOMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Boolean registerUser(UserDBO userDBO) {
       return userMapper.addUser(userDBO);
    }

    @Override
    public List<UserDBO> getAll() {
        return userMapper.getAllUser();
    }
}
