package com.william.springbootmall.dao;

import com.william.springbootmall.dto.UserRegisterRequest;
import com.william.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
