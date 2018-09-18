package com.nt.service.impl;

import com.nt.dao.UserMapper;
import com.nt.model.User;
import com.nt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> selectList() {
        return userMapper.selectList();
    }
    UserServiceImpl(){        //定义构造函数，输出Hello World
        System.out.println("Hellow UserServiceImpl");
    }
}
