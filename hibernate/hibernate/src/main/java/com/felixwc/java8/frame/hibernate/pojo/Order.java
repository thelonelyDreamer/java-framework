package com.felixwc.java8.frame.hibernate.pojo;

import lombok.Data;

/**
 * in order to learn java!
 * created at 2022/3/27 15:53
 *
 * @author wangchao
 */
@Data
public class Order {
    private Integer id;
    private String name;
    private Customer customer;
}
