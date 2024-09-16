package com.wang.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wang.springcloud.pojo.Dept;
import com.wang.springcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    private DeptClientService deptClientService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.querById(id);
    }

    //备选方法
    private Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept()
                .setDeptno(id)
                .setDname("id=>" + id + "没有对应的信息，null--@Hystrix")
                .setDb_source("no this database in MYSQL");
    }
}
