package com.wang.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: DeptProvider_8001
 * Description:
 * date: 2024/7/12 16:28
 *
 * @author Wang
 * @since JDK 1.8
 */

@SpringBootApplication
@ComponentScan("com.wang.springcloud.service")
@EnableEurekaClient //自动注册到eureka中
@EnableDiscoveryClient //服务发现
@EnableHystrix
public class DeptProviderHystrix_8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8001.class, args);
    }

    //增加一个servlet
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }

}
