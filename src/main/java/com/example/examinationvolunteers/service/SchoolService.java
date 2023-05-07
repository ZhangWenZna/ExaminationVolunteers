package com.example.examinationvolunteers.service;

import com.example.examinationvolunteers.pojo.School;

import java.util.List;

public interface SchoolService {
    School selectSchool(Integer schoolId);
    int insertSchool(School school);
    int deleteSchool(Integer schoolId);
    List<School> selectAll();
    int updataSchool(School school);
}
