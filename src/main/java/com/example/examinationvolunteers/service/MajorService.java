package com.example.examinationvolunteers.service;

import com.example.examinationvolunteers.pojo.Major;

import java.util.List;

public interface MajorService {
    Major selectMajor(Integer MajorId);
    int insertMajor(Major user);
    int deleteMajor(Integer MajorId);
    List<Major> selectAll();
    int updataMajor(Major major);
}
