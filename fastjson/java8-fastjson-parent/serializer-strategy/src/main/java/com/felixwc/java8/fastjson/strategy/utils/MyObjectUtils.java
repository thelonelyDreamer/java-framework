package com.felixwc.java8.fastjson.strategy.utils;

import com.felixwc.java8.fastjson.strategy.pojo.MyObject;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/2/23 00:47
 *
 * @author wangchao
 */
public class MyObjectUtils {

    public static MyObject getFullMyObject(){
        return new MyObject("animal",12,true,"112@sina.com",new Date());
    }
}
