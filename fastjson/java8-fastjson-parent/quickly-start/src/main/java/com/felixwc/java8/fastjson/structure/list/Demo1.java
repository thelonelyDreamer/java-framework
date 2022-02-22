package com.felixwc.java8.fastjson.structure.list;

import com.alibaba.fastjson.JSON;
import com.felixwc.java8.fastjson.pojo.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/2/22 23:41
 *
 * @author wangchao
 */
public class Demo1 {
    public static void list2Json(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student().setAge(12).setName("shine").setBirthday(new Date(0)).setId(12L));
        students.add(new Student().setAge(12).setName("shine").setBirthday(new Date(1)).setId(10L));
        String json = JSON.toJSONString(students);
        System.out.println(json);
        //result: [{"age":12,"birthday":0,"id":12,"name":"shine"},
        // {"age":12,"birthday":1,"id":10,"name":"shine"}]
    }

    public static void json2List(){
        String json = "[{\"age\":12,\"birthday\":0,\"id\":12,\"name\":\"shine\"}," +
                "{\"age\":12,\"birthday\":1,\"id\":10,\"name\":\"shine\"}]";
        List<Student> students = JSON.parseArray(json, Student.class);
        students.stream().forEach(System.out::println);
        // 测试略
    }
}
