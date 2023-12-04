package com.example.examanblanc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy
@SpringBootApplication
@EnableScheduling
public class ExamanblancApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamanblancApplication.class, args);
    }

}
