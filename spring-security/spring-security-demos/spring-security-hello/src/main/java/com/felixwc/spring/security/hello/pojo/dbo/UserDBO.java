package com.felixwc.spring.security.hello.pojo.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2021/3/15 19:02
 *
 * @author wangchao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDBO {
    private Integer id;
    private String username;
    private Integer age;
    private String password;
    private Date createTime;
    private Date ModifiedTime;
    private Integer role;
}
