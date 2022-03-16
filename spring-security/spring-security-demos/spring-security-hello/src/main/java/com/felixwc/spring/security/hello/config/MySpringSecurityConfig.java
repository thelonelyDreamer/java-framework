package com.felixwc.spring.security.hello.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * in order to learn java!
 * created at 2022/2/28 14:57
 *
 * @author wangchao
 */
@Configuration
//使用security注解开发
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySpringSecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;

    @Autowired
    public MySpringSecurityConfig(@Qualifier("myUserDetailsService") UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 直接访问，不需要认证
        http.authorizeRequests()
                .antMatchers("/","/hello/**","/user/**","/index.html",
                        "/register.html","/login.html")
                .permitAll()
                .anyRequest()
                .authenticated();

//        //自定义登陆页
//        http.formLogin(form->form
//                .loginPage("/login.html")
//                .loginProcessingUrl("/auth")
//                .defaultSuccessUrl("/index.html")
//                .failureForwardUrl("/error/404.html")
//                .permitAll());
        // 403 页面
        http.exceptionHandling().accessDeniedPage("/error/403.html");
        // 关闭csrf 访问
        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }
}
