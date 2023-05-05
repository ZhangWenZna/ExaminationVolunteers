package com.example.examinationvolunteers.mapper;

import com.example.examinationvolunteers.pojo.School;
import com.example.examinationvolunteers.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {
    User selectSchool(Integer schoolId);
    int insertSchool(School user);
    int deleteSchool(Integer schoolId);
    List<User> selectAll();
    int updataSchool(School user);
}
