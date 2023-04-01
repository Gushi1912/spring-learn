package com.gushi.sb.service.impl;

import com.gushi.sb.dao.UserDao;
import com.gushi.sb.dao.impl.UserDaoImpl;
import com.gushi.sb.service.UserService;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/2/1 9:52
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("UserServiceImpl | 设置属性值");
    }


}
