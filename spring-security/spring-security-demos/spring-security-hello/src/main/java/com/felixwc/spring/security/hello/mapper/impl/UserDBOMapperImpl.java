package com.felixwc.spring.security.hello.mapper.impl;

import com.felixwc.spring.security.hello.mapper.UserDBOMapper;
import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;
import com.felixwc.spring.security.hello.store.UserDBOStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * in order to learn java!
 * created at 2022/2/28 15:52
 *
 * @author wangchao
 */
@Repository
public class UserDBOMapperImpl implements UserDBOMapper {

    @Autowired
    private UserDBOStore store;

    @Override
    public UserDBO getUser(String userName) {
        UserDBO user = store.getUserByName(userName);
        return user;
    }

    @Override
    public boolean addUser(UserDBO user) {
        return store.addUser(user);
    }

    @Override
    public List<UserDBO> getAllUser() {
        return store.getAllUser();
    }
}
