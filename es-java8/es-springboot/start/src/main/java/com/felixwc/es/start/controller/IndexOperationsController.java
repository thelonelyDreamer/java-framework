package com.felixwc.es.start.controller;


import org.elasticsearch.client.indices.CreateIndexRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.IndexInformation;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * in order to learn java!
 * created at 2022/3/6 15:11
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/index")
public class IndexOperationsController {
    private final ElasticsearchRestTemplate restTemplate;

    public IndexOperationsController(ElasticsearchRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //1 索引创建
    @GetMapping("/create/{name}")
    public boolean testCreateIndex(@PathVariable("name")String name) throws IOException {
        // 1 创建索引请求
        CreateIndexRequest request = new CreateIndexRequest("jd_goods");
        // 2 客户端执行请求
        boolean b = restTemplate.indexOps(IndexCoordinates.of(name)).create();
        return b;
    }

    //2.获取索引
    @GetMapping("/get/{name}")
    public String testExist(@PathVariable String name) throws IOException {
        List<IndexInformation> information = restTemplate.indexOps(IndexCoordinates.of("name")).getInformation();

        return null;
    }
    //3 删除索引
    @GetMapping("/delete/{name}")
    public boolean testDelete(@PathVariable String name) throws IOException {
        boolean delete = restTemplate.indexOps(IndexCoordinates.of(name)).delete();
        return delete;
    }
}
