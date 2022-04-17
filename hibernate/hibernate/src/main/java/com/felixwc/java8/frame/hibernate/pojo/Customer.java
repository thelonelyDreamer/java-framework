package com.felixwc.java8.frame.hibernate.pojo;

import lombok.Data;

import java.util.Set;

/**
 * in order to learn java!
 * created at 2022/3/27 15:51
 *
 * @author wangchao
 */
@Data
public class Customer {
    private Integer id;
    private String name;
    private Set<Order> orders;
}
