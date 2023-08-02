package com.lishiqian.project;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lishiqian.project.mapper")
@EnableDubbo
public class CageDogBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CageDogBackendApplication.class, args);
    }

}
