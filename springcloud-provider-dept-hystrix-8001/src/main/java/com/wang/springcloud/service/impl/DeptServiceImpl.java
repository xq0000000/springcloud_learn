package com.wang.springcloud.service.impl;

import com.wang.springcloud.dao.DeptDao;
import com.wang.springcloud.pojo.Dept;
import com.wang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: DeptServiceImpl
 * Description:
 * date: 2024/7/11 16:06
 *
 * @author Wang
 * @since JDK 1.8
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
