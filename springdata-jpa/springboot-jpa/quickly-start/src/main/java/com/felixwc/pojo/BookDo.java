package com.felixwc.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/4/10 14:54
 *
 * @author wangchao
 */
@Entity(name = "book")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class BookDo {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @Column
    private int words; // 字数

    @Column
    private String author; //作者

    @Column
    private float price; // 价格

    @Column
    private Date publishDate; // 出版日期

    @Column
    private boolean exist; // 逻辑删除
    @Column
    private Date createdDate; // 创建日期

    @Column
    private Date modifiedDate; //修改日期
}
