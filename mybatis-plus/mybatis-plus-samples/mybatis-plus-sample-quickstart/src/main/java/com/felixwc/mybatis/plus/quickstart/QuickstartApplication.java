package com.felixwc.mybatis.plus.quickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * in order to learn java!
 * created at 2022/2/21 02:21
 *
 * @author wangchao
 */
@SpringBootApplication
@MapperScan("com.felixwc.mybatis.plus.quickstart.mapper")
public class QuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickstartApplication.class,args);
    }
}
