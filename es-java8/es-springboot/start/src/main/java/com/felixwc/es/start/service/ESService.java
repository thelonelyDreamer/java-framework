package com.felixwc.es.start.service;

import com.felixwc.es.start.pojo.Person;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

/**
 * in order to learn java!
 * created at 2022/3/5 21:54
 *
 * @author wangchao
 */
@Service
public class ESService {
    private RestHighLevelClient restHighLevelClient;

    public ESService(@Qualifier("MyElasticsearchClient") RestHighLevelClient restHighLevelClient) {
        this.restHighLevelClient = restHighLevelClient;
    }

    public void test1() throws IOException {
        // 创建和收取文档
        HashMap<String, String> map = new HashMap<>();
        map.put("name","shine");
        IndexRequest hello = new IndexRequest("hello").id(UUID.randomUUID().toString().replace("-", ""))
                .source(map).setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);
        restHighLevelClient.index(hello, RequestOptions.DEFAULT);
        GetRequest hello1 = new GetRequest().id("1").index("hello");
        GetResponse documentFields = restHighLevelClient.get(hello1, RequestOptions.DEFAULT);
        documentFields.getSourceAsMap().forEach((s,t)->{
            System.out.println(s+t);
        });
    }

    public void test2(){
        Person person = new Person();
        person.setFirstName("Dave");
        Example<Person> example = Example.of(person);
        
    }

}
