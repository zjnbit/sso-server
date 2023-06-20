package com.zjnbit.sso.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zjnbit")
@ServletComponentScan
public class WebApi {
    public static void main(String[] args) {
        SpringApplication.run(WebApi.class, args);
    }
}