package com.gushi.sb;

import com.gushi.sb.dao.UserDao;
import com.gushi.sb.service.UserService;
import com.gushi.sb.service.impl.UserServiceImpl;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/2/1 10:21
 */
public class BeanFactoryTest {
    public static void main(String[] args) {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("beans.xml");

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
        UserService userService = (UserService) beanFactory.getBean("userService");

        System.out.println(userDao);
        System.out.println(userService);


    }


}
