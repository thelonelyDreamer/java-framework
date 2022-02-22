package com.felixwc.java8.fastjson.strategy.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.felixwc.java8.fastjson.strategy.pojo.MyObject;
import com.felixwc.java8.fastjson.strategy.utils.MyObjectUtils;

/**
 * in order to learn java!
 * created at 2022/2/23 00:50
 *
 * @author wangchao
 */

public class Demo3 {
    public static void main(String[] args) {
        MyObject fullMyObject = MyObjectUtils.getFullMyObject();
        // 目的：Date使用ISO8601格式输出，默认为false
        String s = JSON.toJSONString(fullMyObject, SerializerFeature.UseISO8601DateFormat);
        System.out.println(s);
        // 结果：
    }
}
