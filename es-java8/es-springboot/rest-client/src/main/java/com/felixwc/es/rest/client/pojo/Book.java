package com.felixwc.es.rest.client.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * in order to learn java!
 * created at 2022/3/7 13:06
 *
 * @author wangchao
 */
@Data
@Document(indexName = "book",createIndex = true)
@Accessors(chain = true)
public class Book {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private int age;
    @Field
    private double price;
}
