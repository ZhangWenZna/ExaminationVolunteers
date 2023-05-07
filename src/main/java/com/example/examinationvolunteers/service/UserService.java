package com.example.examinationvolunteers.service;

import com.example.examinationvolunteers.pojo.User;

import java.util.List;

public interface UserService {
    User selectUser(Integer id);
    int insertUser(User user);
    int deleteUser(Integer UserId);
    List<User> selectAll();
    int updataUser(User user);
}
