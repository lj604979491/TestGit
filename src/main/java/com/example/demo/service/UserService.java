package com.example.demo.service;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    User findUserById(@Param("id") Integer id);
}
