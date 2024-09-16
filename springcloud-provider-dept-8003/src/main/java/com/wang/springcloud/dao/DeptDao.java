package com.wang.springcloud.dao;

import com.wang.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: DeptDao
 * Description:
 * date: 2024/7/11 15:54
 *
 * @author Wang
 * @since JDK 1.8
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
