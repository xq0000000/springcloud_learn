package com.wang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * ClassName: Dept
 * Description:
 * date: 2024/7/9 11:47
 * @author Wang
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法,dept.setDeptNo(11).setDeptNo(12)
public class Dept implements Serializable { //1.序列化

    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
