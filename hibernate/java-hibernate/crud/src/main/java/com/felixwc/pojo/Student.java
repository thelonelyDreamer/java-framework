package com.felixwc.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * in order to learn java!
 * created at 2022/7/21 17:10
 *
 * @author felixwc
 */
@Data
@Accessors(chain = true)
public class Student implements Serializable {
    private  Integer id;
    private String name;
    private Integer age;
    private Grade grade;
}
