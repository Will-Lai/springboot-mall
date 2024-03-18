package com.william.springbootmall.service.impl;

import com.william.springbootmall.dao.UserDao;
import com.william.springbootmall.dto.UserRegisterRequest;
import com.william.springbootmall.model.User;
import com.william.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
