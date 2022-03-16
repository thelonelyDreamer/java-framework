package com.felixwc.es.rest.client.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * in order to learn java!
 * created at 2022/3/6 14:35
 *
 * @author wangchao
 */
@Data
@Document(indexName = "hello",createIndex = false)
@Accessors(chain = true)
public class Person {
    @Id
    private String id;
    @Field(type = FieldType.Keyword)
    private String firstName;
    @Field
    private String lastName;
    @Field
    private Address address;

}
