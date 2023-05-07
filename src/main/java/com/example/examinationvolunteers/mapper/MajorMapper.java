package com.example.examinationvolunteers.mapper;


import com.example.examinationvolunteers.pojo.Major;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MajorMapper {
    Major selectMajor(Integer majorId);
    int insertMajor(Major major);
    int deleteMajor(Integer majorId);
    List<Major> selectAll();
    int updataMajor(Major major);
}
