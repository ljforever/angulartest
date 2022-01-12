package com.gwhn.angulartest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.gwhn.angulartest")
@MapperScan("com.gwhn.angulartest*")
public class AngulartestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AngulartestApplication.class, args);
    }

}
