package com.felixwc.spring.security.hello.store;

import com.felixwc.spring.security.hello.pojo.dbo.UserDBO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * in order to learn java!
 * created at 2022/2/28 15:42
 *
 * @author wangchao
 */
@Component
public class UserDBOStore {
    private static final ConcurrentHashMap<Integer, UserDBO> store = new ConcurrentHashMap<>();

    static {
        UserDBO userDBO = new UserDBO();
        userDBO.setId("root".hashCode());
        userDBO.setUsername("root");
        userDBO.setPassword(new BCryptPasswordEncoder().encode("123"));
        store.put(userDBO.getId(),userDBO);
    }

    public boolean addUser(UserDBO user){
        boolean result = false;
        try {
            store.put(user.getId(),user);
            result =true;
        } catch (Exception e){
            result = false;
        }finally {

        }
        return result;
    }
    public UserDBO getUserByName(String userName){
        UserDBO userDBO = store.get(userName);
        return userDBO;
    }

    public List<UserDBO> getAllUser(){
        List<UserDBO> userDBOS = new LinkedList<>();
        synchronized (this){
            userDBOS.addAll(store.values());
        }
        return userDBOS;
    }

}
