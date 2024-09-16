package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: DeptProvider_8002
 * Description:
 * date: 2024/7/12 16:28
 *
 * @author Wang
 * @since JDK 1.8
 */

@SpringBootApplication
@ComponentScan("com.wang")
@EnableEurekaClient //自动注册到eureka中
@EnableDiscoveryClient //服务发现
public class DeptProvider_8002 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8002.class, args);
    }
}
