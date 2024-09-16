package com.wang.springcloud.service;

import com.wang.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * ClassName: DeptClientService
 * Description:
 * date: 2024/7/31 11:09
 *
 * @author Wang
 * @since JDK 1.8
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT", fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    public Dept querById(@PathVariable("id") long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);
}
