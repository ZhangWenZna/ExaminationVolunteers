package com.example.examinationvolunteers.service.impl;

import com.example.examinationvolunteers.mapper.UserMapper;
import com.example.examinationvolunteers.pojo.User;
import com.example.examinationvolunteers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User selectUser(Integer id) {
        return userMapper.selectUser(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUser(Integer UserId) {
        return userMapper.deleteUser(UserId);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updataUser(User user) {
        return userMapper.updataUser(user);
    }
}
