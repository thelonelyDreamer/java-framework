package com.felixwc.spring.security.hello.mapper;

import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/3/15 19:11
 *
 * @author wangchao
 */
public interface UserDBOMapper {
    UserDBO getUser(String userName);
    boolean addUser(UserDBO user);
    List<UserDBO> getAllUser();
}
