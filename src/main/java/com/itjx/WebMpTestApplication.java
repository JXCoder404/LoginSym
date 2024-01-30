package com.itjx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.itjx.mapper")
@SpringBootApplication
public class WebMpTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebMpTestApplication.class, args);
    }

}
