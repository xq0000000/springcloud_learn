package com.wang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ConfigClientController
 * Description:
 * date: 2024/7/31 22:04
 *
 * @author Wang
 * @since JDK 1.8
 */
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping
    public String getConfig() {
        return "application" + applicationName
                + "eurekaServer" + eurekaServer
                + "port" + port;
    }
}
