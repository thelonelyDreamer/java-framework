package com.felixwc.java.fastjson.annotation.pojo;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

/**
 * in order to learn java!
 * created at 2022/2/23 16:25
 *
 * @author wangchao
 */
@Data
@JSONType()
public class Person2 {
    private long id;
    private String name;
}
