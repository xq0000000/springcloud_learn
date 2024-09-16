package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * ClassName: EurekaServer_7001
 * Description:
 * date: 2024/7/26 11:36
 * @author Wang
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7003.class, args);
    }
}
