package com.wang.springcloud.controller;

import com.wang.springcloud.pojo.Dept;
import com.wang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

    @Resource
    private DeptClientService service = null;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return this.service.queryAll();
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.querById(id);
    }



}
