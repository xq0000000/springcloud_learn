package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: DeptConsumer_80
 * Description:
 * date: 2024/7/25 16:39
 *
 * @author Wang
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.wang.springcloud")
@ComponentScan("com.wang")
public class FeignDeptConsumer {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer.class, args);
    }
}
