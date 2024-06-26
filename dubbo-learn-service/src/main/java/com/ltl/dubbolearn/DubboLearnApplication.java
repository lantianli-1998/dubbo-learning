package com.ltl.dubbolearn;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboLearnApplication.class, args);
    }

}
