package com.example.examinationvolunteers.service;

import com.example.examinationvolunteers.pojo.EvamData;

import java.util.List;

public interface EvamDataService {
    EvamData selectEvamData(Integer evamDataId);
    int insertEvamData(EvamData evamData);
    int deleteEvamData(Integer evamDataId);
    List<EvamData> selectAll();
    int updataEvamData(EvamData evamData);
}
