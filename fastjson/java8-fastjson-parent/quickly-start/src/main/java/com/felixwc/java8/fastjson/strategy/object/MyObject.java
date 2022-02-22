package com.felixwc.java8.fastjson.strategy.object;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/2/23 00:14
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
public class MyObject {
    private String name;
    private Date creatTime;
    private boolean exist;
    private int age;
}
