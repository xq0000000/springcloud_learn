package com.wang.springcloud.service;

import com.wang.springcloud.pojo.Dept;

import java.util.List;

/**
 * ClassName: DeptService
 * Description:
 * date: 2024/7/11 16:05
 *
 * @author Wang
 * @since JDK 1.8
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
