package com.felixwc.spring.security.hello.service;


import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;

import java.util.List;

public interface UserService {
    Boolean registerUser(UserDBO userDBO);
    List<UserDBO> getAll();
}
