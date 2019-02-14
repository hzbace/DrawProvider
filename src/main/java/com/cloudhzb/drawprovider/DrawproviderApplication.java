package com.cloudhzb.drawprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//提供者
public class DrawproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrawproviderApplication.class, args);
    }

}

