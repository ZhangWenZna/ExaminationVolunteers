package com.example.examinationvolunteers.mapper;

import com.example.examinationvolunteers.pojo.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolMapper {
    School selectSchool(Integer schoolId);
    int insertSchool(School school);
    int deleteSchool(Integer schoolId);
    List<School> selectAll();
    int updataSchool(School school);
}
