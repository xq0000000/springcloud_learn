package com.wang.springcloud.controller;

import com.wang.springcloud.pojo.Dept;
import com.wang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: DeptController
 * Description:
 * date: 2024/7/11 16:07
 *
 * @author Wang
 * @since JDK 1.8
 */
@RestController
public class DeptController {

    @Resource
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") long id) {
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    /**
     * 获取注册进来的微服务具体信息
     */
    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> services = client.getServices();
        System.out.println("discovery=>services:" + services);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");

        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId()
            );
        }
        return this.client;
    }
}
