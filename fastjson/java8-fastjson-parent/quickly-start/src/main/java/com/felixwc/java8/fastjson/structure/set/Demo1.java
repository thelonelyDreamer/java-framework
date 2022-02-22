package com.felixwc.java8.fastjson.structure.set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.felixwc.java8.fastjson.pojo.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * in order to learn java!
 * created at 2022/2/23 02:00
 *
 * @author wangchao
 */
public class Demo1 {
    public static void set2Json(){
        Set<Student> students = new HashSet<>();
        students.add(new Student(1L,"shine",12,null,null));
        students.add(new Student(2L,"sunshine",12,null,null));
        String s = JSON.toJSONString(students);
        System.out.println(s);
        //result:[{"age":12,"id":2,"name":"sunshine"},{"age":12,"id":1,"name":"shine"}]
    }

    public static void json2set(){
        String json = "[{\"age\":12,\"id\":2,\"name\":\"sunshine\"},{\"age\":12,\"id\":1,\"name\":\"shine\"}]";
        Set<Student> students = JSON.parseObject(json, new TypeReference<Set<Student>>() {});
        // 测试略
    }
}
