package com.felixwc.sping.security.quickly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * in order to learn java!
 * created at 2022/3/1 13:25
 *
 * @author wangchao
 */
@EnableWebSecurity()
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BootStartApp {
    public static void main(String[] args) {
        SpringApplication.run(BootStartApp.class,args);
    }
}
