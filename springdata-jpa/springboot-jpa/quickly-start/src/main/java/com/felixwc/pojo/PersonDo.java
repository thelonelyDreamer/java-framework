package com.felixwc.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * in order to learn java!
 * created at 2022/4/10 13:41
 *
 * @author wangchao
 */
@Entity(name = "person")
@Data
public class PersonDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personId;
    @Column
    private String name;
    @Column
    private String password;
}
