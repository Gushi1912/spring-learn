package com.gushi.sb.factory;

import com.gushi.sb.service.UserService;
import com.gushi.sb.service.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/2/2 13:21
 */
public class MyFactoryBean implements FactoryBean<UserService> {
    @Override
    public UserService getObject() throws Exception {
        System.out.println("继承接口实现工厂方法bean的实例化");
        return new UserServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
}
