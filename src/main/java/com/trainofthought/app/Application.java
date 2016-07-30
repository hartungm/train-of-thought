package com.trainofthought.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.trainofthought.nodes.rest, com.trainofthought.view, com.trainofthought.connections.rest")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}