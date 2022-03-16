package com.felixwc.es.start.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

/**
 * in order to learn java!
 * created at 2022/3/5 21:51
 *
 * @author wangchao
 */
@Configuration
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    @Override
    @Bean("MyElasticsearchClient")
    public RestHighLevelClient elasticsearchClient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();

        return RestClients.create(clientConfiguration).rest();
    }



}
