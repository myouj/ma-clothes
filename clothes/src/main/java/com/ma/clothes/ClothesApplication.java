package com.ma.clothes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class ClothesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClothesApplication.class, args);
    }

}
