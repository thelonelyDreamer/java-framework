package com.felixwc.es.start.controller;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/6 14:45
 *
 * @author wangchao
 */
@RestController
public class ESController {
    private ElasticsearchOperations elasticsearchOperations;

    public ESController(ElasticsearchOperations elasticsearchOperations) {
        this.elasticsearchOperations = elasticsearchOperations;
    }

    private void test1(){

        elasticsearchOperations.save("string");
    }
}
