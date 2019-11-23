package com.springboot.demo.sblearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = { "com.springboot.demo.sblearning.dao" })
@ComponentScan(basePackages = {"com.springboot.demo.sblearning.controller","com.springboot.demo.sblearning.dao",
        "com.springboot.demo.sblearning.service"})
@EnableCaching
@SpringBootApplication
public class SblearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SblearningApplication.class, args);
    }

}
