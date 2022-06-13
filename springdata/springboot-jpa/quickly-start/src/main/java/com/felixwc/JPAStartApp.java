package com.felixwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * in order to learn java!
 * created at 2022/4/10 12:56
 *
 * @author wangchao
 */
@SpringBootApplication
public class JPAStartApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(JPAStartApp.class, args);
        DataSourceProperties bean = app.getBean(DataSourceProperties.class);
        System.out.println(bean.getType());
    }
}
