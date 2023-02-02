package com.gushi.sb.factory;

import com.gushi.sb.service.UserService;
import com.gushi.sb.service.impl.UserServiceImpl;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/2/2 10:41
 */
public class InstanceUserServiceFactory {


    public UserService getUserService() {
        System.out.println("UserServiceImpl | 通过实例工厂获取实例对象");
        System.out.println("UserServiceImpl | 不接收参数");
        return new UserServiceImpl();
    }
}
