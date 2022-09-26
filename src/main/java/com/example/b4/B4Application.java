package com.example.b4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class B4Application {

    public static void main(String[] args) {
        System.out.println("application");
        SpringApplication.run(B4Application.class, args);
    }

}
