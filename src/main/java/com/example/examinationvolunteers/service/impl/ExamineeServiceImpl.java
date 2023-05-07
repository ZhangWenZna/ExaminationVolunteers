package com.example.examinationvolunteers.service.impl;

import com.example.examinationvolunteers.mapper.ExamineeMapper;
import com.example.examinationvolunteers.pojo.Examinee;
import com.example.examinationvolunteers.service.ExamineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamineeServiceImpl implements ExamineeService {
    @Autowired
    ExamineeMapper examineeMapper;
    @Override
    public Examinee selectExaminee(Integer examineeId) {
        return examineeMapper.selectExaminee(examineeId);
    }

    @Override
    public int insertExaminee(Examinee examinee) {
        examineeMapper.insertExaminee(examinee);
        return 0;
    }

    @Override
    public int deleteExaminee(Integer examineelId) {
        examineeMapper.deleteExaminee(examineelId);
        return 0;
    }

    @Override
    public List<Examinee> selectAll() {
        return examineeMapper.selectAll();
    }

    @Override
    public int updataExaminee(Examinee examinee) {
        examineeMapper.updataExaminee(examinee);
        return 0;
    }
}
