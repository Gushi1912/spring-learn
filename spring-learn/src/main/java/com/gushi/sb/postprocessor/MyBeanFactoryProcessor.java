package com.gushi.sb.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/3/25 17:48
 */
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("执行了自定义的BeanFactoryProcessor");

//        BeanDefinition userService = configurableListableBeanFactory.getBeanDefinition("userService");
//        userService.setBeanClassName("com.gushi.sb.dao.impl.UserDaoImpl");
//        System.out.println(userService);

        //
//        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
//        rootBeanDefinition.setBeanClassName("com.gushi.sb.dao.impl.PersonDaoImpl");
//        DefaultListableBeanFactory listableBeanFactory = (DefaultListableBeanFactory) configurableListableBeanFactory;
//        listableBeanFactory.registerBeanDefinition("personDao", rootBeanDefinition);

    }
}
