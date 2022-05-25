package com.felixwc.springboot.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * in order to learn java!
 * created at 2021/9/18 23:11
 *
 * @author wangchao
 */
@SpringBootApplication
@Controller
@EnableSwagger2WebMvc
public class Swagger2BootApp {
    public static void main(String[] args) {
        SpringApplication.run(Swagger2BootApp.class,args);
    }

    @RequestMapping("/")
    public String getIndex(){
        return "redirect:index.html";
    }
}
