package com.felixwc.fastjson.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/2/23 01:37
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
public class Person {
    private String name;
    private int age;
    private boolean exist;
    private Date birthDay;
    private String email;
}
