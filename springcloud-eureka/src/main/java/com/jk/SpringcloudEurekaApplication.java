package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //代表开启eureka的注册中服务
public class SpringcloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaApplication.class, args);
    }

}
