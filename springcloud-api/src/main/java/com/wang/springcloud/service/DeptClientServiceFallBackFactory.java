package com.wang.springcloud.service;

import com.wang.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName: DeptClientServiceFallBackFactory
 * Description:
 * date: 2024/7/31 15:34
 *
 * @author Wang
 * @since JDK 1.8
 */
//降级
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory {

    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public Dept querById(long id) {
                return new Dept().setDeptno(id)
                        .setDname("id=>" + id + "没有对应的信息,客户端提供了降级的信息，这个服务现在已经被关闭")
                        .setDb_source("没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
