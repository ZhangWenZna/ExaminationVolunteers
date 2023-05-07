package com.example.examinationvolunteers.mapper;

import com.example.examinationvolunteers.pojo.EvamData;
import com.example.examinationvolunteers.pojo.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EvamDataMapper {
    EvamData selectEvamData(Integer evamDataId);
    int insertEvamData(EvamData evamData);
    int deleteEvamData(Integer evamDataId);
    List<EvamData> selectAll();
    int updataEvamData(EvamData evamData);
}
