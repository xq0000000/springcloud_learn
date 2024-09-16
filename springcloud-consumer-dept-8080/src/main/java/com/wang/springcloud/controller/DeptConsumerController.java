package com.wang.springcloud.controller;

import com.wang.springcloud.pojo.Dept;
import com.wang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ClassName: DeptConsumerController
 * Description:
 * date: 2024/7/25 16:15
 *
 * @author Wang
 * @since JDK 1.8
 */
@RestController
public class DeptConsumerController {

    //RestTemplate
    //(url, 实体:map, Class<T> responseType)
    @Autowired
    private RestTemplate restTemplate; //提供多种便捷访问远程http服务的方法，简单的restful服务模板

    //Ribbon 这里的地址，应该是一个变量，通过服务名访问
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }



}
