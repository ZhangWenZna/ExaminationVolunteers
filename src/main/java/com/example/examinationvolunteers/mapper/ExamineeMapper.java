package com.example.examinationvolunteers.mapper;

import com.example.examinationvolunteers.pojo.Examinee;
import com.example.examinationvolunteers.pojo.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ExamineeMapper {
    Examinee selectExaminee(Integer examineeId);
    int insertExaminee(Examinee examinee);
    int deleteExaminee(Integer examineelId);
    List<Examinee> selectAll();
    int updataExaminee(Examinee examinee);
}
