package com.william.springbootmall.service;

import com.william.springbootmall.dto.UserLoginRequest;
import com.william.springbootmall.dto.UserRegisterRequest;
import com.william.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
