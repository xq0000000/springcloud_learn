package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * ClassName: DeptConsumerDashboard
 * Description:
 * date: 2024/7/31 15:57
 *
 * @author Wang
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashboard {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard.class, args);
    }
}
