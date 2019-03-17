package com.ma.clothes;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.ma.clothes.dao")
public class ClothesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClothesApplication.class, args);
    }

}
