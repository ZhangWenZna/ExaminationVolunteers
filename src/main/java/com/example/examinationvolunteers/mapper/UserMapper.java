package com.example.examinationvolunteers.mapper;

import com.example.examinationvolunteers.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    User selectUser(Integer id);
//    int insertUser(User user);
//    int deleteUser(Integer id);
//    List<User> selectAll();
//    int updataUser(User user);
}
