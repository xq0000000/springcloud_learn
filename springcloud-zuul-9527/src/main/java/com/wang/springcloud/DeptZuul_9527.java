package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName: DeptZuul
 * Description:
 * date: 2024/7/31 21:17
 *
 * @author Wang
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableZuulProxy
public class DeptZuul_9527 {
    public static void main(String[] args) {
        SpringApplication.run(DeptZuul_9527.class, args);
    }
}
