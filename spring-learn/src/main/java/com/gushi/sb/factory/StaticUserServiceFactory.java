package com.gushi.sb.factory;

import com.gushi.sb.service.UserService;
import com.gushi.sb.service.impl.UserServiceImpl;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/2/1 14:36
 */
public class StaticUserServiceFactory {


    //把该方法的返回值作为实例对象放入到容器中
    public static UserService getUserService(String height) {
        System.out.println("UserServiceImpl | 通过静态工厂方法获取bean");
        System.out.println("UserServiceImpl | 通过<constructor-arg>标签获取方法参数, args = " + height);
        return new UserServiceImpl();
    }
}
