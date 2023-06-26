package com.example.springmvc_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class SpringMvc1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvc1Application.class, args);
    }
}
