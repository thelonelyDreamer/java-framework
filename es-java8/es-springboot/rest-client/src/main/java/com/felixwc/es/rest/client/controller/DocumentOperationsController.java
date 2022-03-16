package com.felixwc.es.rest.client.controller;

import com.felixwc.es.rest.client.pojo.Book;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.UUID;

/**
 * in order to learn java!
 * created at 2022/3/7 11:01
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/book")
public class DocumentOperationsController {
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    public DocumentOperationsController(ElasticsearchRestTemplate elasticsearchRestTemplate) {
        this.elasticsearchRestTemplate = elasticsearchRestTemplate;
    }

    @RequestMapping("/add")
    public String addDocument(){
        IndexQuery sunshine = new IndexQueryBuilder()
                .withId(UUID.randomUUID().toString().replace("-", ""))
                .withObject(new Book().setName("java"))
                .build();
        String bookId = elasticsearchRestTemplate.index(sunshine, IndexCoordinates.of("book"));
        return bookId;
    }

    @RequestMapping("/delete")
    public String deleteDocument(){
        Pageable pageable= PageRequest.of(0,999);
        NativeSearchQueryBuilder builder=new NativeSearchQueryBuilder();
        NativeSearchQuery query=builder.withQuery(QueryBuilders.queryStringQuery("java"))
                .withPageable(pageable).build();
        SearchHits<Book> book = elasticsearchRestTemplate.search(query, Book.class, IndexCoordinates.of("book"));
        Iterator<SearchHit<Book>> iterator = book.iterator();
        while (iterator.hasNext()){
            SearchHit<Book> next = iterator.next();
            elasticsearchRestTemplate.delete(next.getContent().getId());
        }

        return null;
    }


}
