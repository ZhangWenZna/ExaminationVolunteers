package com.example.examinationvolunteers.service.impl;

import com.example.examinationvolunteers.mapper.SchoolMapper;
import com.example.examinationvolunteers.pojo.School;
import com.example.examinationvolunteers.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolMapper schoolMapper;
    @Override
    public School selectSchool(Integer schoolId) {
        return schoolMapper.selectSchool(schoolId);
    }

    @Override
    public int insertSchool(School school) {
        schoolMapper.insertSchool(school);
        return 0;
    }

    @Override
    public int deleteSchool(Integer schoolId) {
        schoolMapper.deleteSchool(schoolId);
        return 0;
    }

    @Override
    public List<School> selectAll() {
        return schoolMapper.selectAll();
    }

    @Override
    public int updataSchool(School school) {
        schoolMapper.updataSchool(school);
        return 0;
    }
}
