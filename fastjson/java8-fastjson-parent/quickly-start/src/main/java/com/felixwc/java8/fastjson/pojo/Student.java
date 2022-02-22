package com.felixwc.java8.fastjson.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/2/22 20:30
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
public class Student {
    private long id;
    private String name;
    private Integer age;
    private String email;
    private Date birthday;
}
