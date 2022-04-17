package com.felixwc.springboot.jpa.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * in order to learn java!
 * created at 2022/3/27 13:43
 *
 * @author wangchao
 */
@Data
@Table()
public class PersonDO {
    @Id
    private long id;
    @Column
    private String name;
    private String age;
}
