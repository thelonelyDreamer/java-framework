package com.felixwc.spring.security.hello.service.security;

import com.felixwc.spring.security.hello.enums.RoleEnum;
import com.felixwc.spring.security.hello.mapper.UserDBOMapper;
import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/3/15 19:32
 *
 * @author wangchao
 */
@Service("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    private final UserDBOMapper userMapper;

    public MyUserDetailsService(UserDBOMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDBO userDBO = userMapper.getUser(username);
        if(null == userDBO){
            throw new UsernameNotFoundException("user not exit");
        }
        String password = userDBO.getPassword();
        String role = RoleEnum.getRole(userDBO.getRole());
        // 用户角色
        List<GrantedAuthority> auth= AuthorityUtils.createAuthorityList(role);
        System.out.println(username+password);
        return new User(username,password,auth);
    }
}
