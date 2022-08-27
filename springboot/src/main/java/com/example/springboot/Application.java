package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    //java –jar xx.jar --spring.profiles.active=dev
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
