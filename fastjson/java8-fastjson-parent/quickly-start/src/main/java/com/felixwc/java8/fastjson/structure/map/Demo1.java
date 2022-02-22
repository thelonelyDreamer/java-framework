package com.felixwc.java8.fastjson.structure.map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.felixwc.java8.fastjson.pojo.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * in order to learn java!
 * created at 2022/2/22 23:48
 *
 * @author wangchao
 */
public class Demo1 {

    public static void map2Json(){
        Map<String, Student> map = new HashMap<String, Student>();
        map.put("shine",new Student().setId(1L).setName("shine").setAge(18).setBirthday(new Date()));
        map.put("marry",new Student().setId(1L).setName("marry").setAge(18).setBirthday(new Date()));
        System.out.println(JSON.toJSONString(map));
        // result: {"marry":{"age":18,"birthday":1645545196937,"id":1,"name":"marry"},
        // "shine":{"age":18,"birthday":1645545196937,"id":1,"name":"shine"}}
    }

    public static void json2Map(){
        String json = "{\"marry\":{\"age\":18,\"birthday\":1645545196937,\"id\":1,\"name\":\"marry\"},"+
                "\"shine\":{\"age\":18,\"birthday\":1645545196937,\"id\":1,\"name\":\"shine\"}}";
        Map<String, Student> map = JSON.parseObject(json, new TypeReference<Map<String, Student>>() {
        });
        //测试略
    }


}
