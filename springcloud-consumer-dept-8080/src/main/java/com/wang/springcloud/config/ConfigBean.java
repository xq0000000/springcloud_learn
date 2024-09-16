package com.wang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: ConfigBean
 * Description:
 * date: 2024/7/25 16:20
 *
 * @author Wang
 * @since JDK 1.8
 */
@Configuration //spring applicationContext.xml
public class ConfigBean {

    @Bean
    @LoadBalanced // Ribbon
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
