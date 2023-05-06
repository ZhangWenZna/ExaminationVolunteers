package com.example.examinationvolunteers.mapper;


import com.example.examinationvolunteers.pojo.Major;

import java.util.List;

public interface MajorMapper {
    Major selectMajor(Integer MajorId);
    int insertMajor(Major user);
    int deleteMajor(Integer MajorId);
    List<Major> selectAll();
    int updataMajor(Major major);
}
