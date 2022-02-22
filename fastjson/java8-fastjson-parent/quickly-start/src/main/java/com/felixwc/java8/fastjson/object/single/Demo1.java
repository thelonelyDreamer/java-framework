package com.felixwc.java8.fastjson.object.single;

import com.alibaba.fastjson.JSON;
import com.felixwc.java8.fastjson.pojo.Student;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/2/22 20:34
 *
 * @author wangchao
 */
public class Demo1 {

    public static void convertFrom1ObjectToString(){
        Student student = new Student();
        student.setAge(18)
                .setBirthday(new Date(1))
                .setId(2L)
                .setEmail("123@qq.com")
                .setName("shine");
        String jsonOfShine = JSON.toJSONString(student);
        System.out.println(jsonOfShine);
        // result: {"age":18,"birthday":1,"email":"123@qq.com","id":2,"name":"shine"}
    }

    public static void convertFromStringToObject(){
        String jsonOfShine = "{\"age\":18,\"birthday\":1,\"email\":\"123@qq.com\",\"id\":2,\"name\":\"shine\"}";
        Student shine = JSON.parseObject(jsonOfShine, Student.class);
        System.out.println(shine);
        // result:
    }
}
