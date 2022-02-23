package com.felixwc.java.fastjson.annotation.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * in order to learn java!
 * created at 2022/2/23 16:25
 *
 * @author wangchao
 */
@Data
public class Person {
    private long id;
    @JSONField()
    private String name;
}
