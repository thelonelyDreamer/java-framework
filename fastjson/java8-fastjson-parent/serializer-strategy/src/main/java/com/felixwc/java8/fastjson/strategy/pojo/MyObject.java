package com.felixwc.java8.fastjson.strategy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/2/23 00:39
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class MyObject {
    private String name;
    private int age;
    private boolean exist;
    private String email;
    private Date createdTime;
}
