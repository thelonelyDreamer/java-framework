package com.felixwc.java8.fastjson.strategy.object;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/2/23 00:18
 *
 * @author wangchao
 */
public class ObjectUtils {
    public static MyObject getFullObject(){
        return new MyObject().setAge(10).setExist(true).setName("object").setCreatTime(new Date());
    }
}
