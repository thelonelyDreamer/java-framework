package com.felixwc.springboot.swagger2.pojo;

import io.swagger.annotations.ApiModel;

/**
 * in order to learn java!
 * created at 2022/1/31 15:49
 *
 * @author wangchao
 */
@ApiModel(value = "value",description = "description",discriminator = "discriminator")
public class APIDemo {
    private String firstName;
    private String lastName;
}
