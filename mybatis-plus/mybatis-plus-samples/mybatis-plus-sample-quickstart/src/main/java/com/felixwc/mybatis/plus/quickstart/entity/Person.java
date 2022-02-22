package com.felixwc.mybatis.plus.quickstart.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * in order to learn java!
 * created at 2022/2/21 02:25
 *
 * @author wangchao
 */

@Data
public class Person {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
