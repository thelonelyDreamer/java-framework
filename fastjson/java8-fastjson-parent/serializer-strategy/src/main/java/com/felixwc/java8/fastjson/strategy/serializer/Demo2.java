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

public class Demo2 {
    public static void main(String[] args) {
        MyObject fullMyObject = MyObjectUtils.getFullMyObject();
        fullMyObject.setEmail(null);
        // 目的： null 值会输出
        String s = JSON.toJSONString(fullMyObject, SerializerFeature.WriteMapNullValue);
        System.out.println(s);
        // 结果：{"age":12,"createdTime":1645549178491,"email":null,"exist":true,"name":"animal"}
    }
}
