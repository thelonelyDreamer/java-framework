package com.felixwc.java8.fastjson.problem;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/2/22 23:23
 *
 * @author wangchao
 */
public class Demo1 {

    public static void testCircleDependencies(){
        School school = new School();
        school.setName("school");
        Student student1 = new Student();
        student1.setSchool(school);
        student1.setName("张三");
        Student student2 = new Student();
        student2.setName("李四");
        student2.setSchool(school);
        LinkedList<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        school.setStudents(students);
        System.out.println(JSON.toJSONString(school));
        // result: {"name":"school","students":[{"name":"张三","school":{"$ref":"$"}},{"name":"李四","school":{"$ref":"$"}}]}
    }

    @Data
    private static class Student{
        private String name;
        private School school;
    }
    @Data
    private static class School{
        private String name;
        private List<Student> students;
    }
}
