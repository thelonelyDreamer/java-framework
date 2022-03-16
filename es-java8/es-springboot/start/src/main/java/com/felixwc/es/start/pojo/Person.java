package com.felixwc.es.start.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * in order to learn java!
 * created at 2022/3/6 14:35
 *
 * @author wangchao
 */
@Data
public class Person {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Address address;

}
