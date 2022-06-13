package com.felixwc.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * in order to learn java!
 * created at 2022/6/8 18:19
 *
 * @author felixwc
 */
@Data
@Entity
@Table(name = "person1",indexes = {@Index(columnList = "name,age"),@Index(columnList = "email")})
public class Person1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
