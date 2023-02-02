package com.gushi.sb;

import com.gushi.sb.dao.UserDao;
import com.gushi.sb.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/2/1 10:27
 */
public class ApplicationContextTest {


    public static final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    public static void main(String[] args) {
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        UserService userService1 = (UserService) applicationContext.getBean("userService");
//        applicationContext.close();
//        System.out.println(userDao);


        //使用静态工厂方法获取bean
//        getUserServiceByStaticFactory();

        //使用实例工厂方法获取bean
        getUserServiceByInstanceFactory();

    }


    public static void getUserServiceByStaticFactory() {
        UserService userService2 = (UserService) applicationContext.getBean("staticUserServiceFactory");
        System.out.println(userService2);
    }


    public static void getUserServiceByInstanceFactory() {
        UserService userService3 = (UserService) applicationContext.getBean("userService");
        System.out.println(userService3);
    }
}
