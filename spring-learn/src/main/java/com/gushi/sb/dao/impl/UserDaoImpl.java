package com.gushi.sb.dao.impl;

import com.gushi.sb.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/2/1 9:52
 */
public class UserDaoImpl implements UserDao , InitializingBean {

    private String name;
    private Integer age;

    public UserDaoImpl() {
        System.out.println("UserDaoImpl | 执行无参构造方法");
    }

    public UserDaoImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("UserDaoImpl | 执行有参构造方法");
    }

    public void init() {
        System.out.println("UserDaoImpl | 执行初始化方法");
    }

    public void destroy() {
        System.out.println("UserDaoImpl | 执行销毁方法");
    }

    @Override
    //afterPropertiesSet方法在初始化方法之前执行，初始化方法在对象实例化之后执行
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserDaoImpl | 实现InitializingBean接口的方法。。。。。。");
    }
}
