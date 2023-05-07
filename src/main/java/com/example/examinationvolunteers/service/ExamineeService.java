package com.example.examinationvolunteers.service;

import com.example.examinationvolunteers.pojo.Examinee;

import java.util.List;

public interface ExamineeService {
    Examinee selectExaminee(Integer examineeId);
    int insertExaminee(Examinee examinee);
    int deleteExaminee(Integer examineelId);
    List<Examinee> selectAll();
    int updataExaminee(Examinee examinee);
}
