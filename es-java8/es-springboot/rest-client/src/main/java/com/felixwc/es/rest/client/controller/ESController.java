package com.felixwc.es.rest.client.controller;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/6 14:45
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hello")
public class ESController {
    private ElasticsearchOperations elasticsearchOperations;
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    public ESController(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    @GetMapping("/test1")
    public void test1(){

    }
}
