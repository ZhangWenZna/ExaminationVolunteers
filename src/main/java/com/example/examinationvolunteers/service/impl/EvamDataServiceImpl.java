package com.example.examinationvolunteers.service.impl;

import com.example.examinationvolunteers.mapper.EvamDataMapper;
import com.example.examinationvolunteers.mapper.ExamineeMapper;
import com.example.examinationvolunteers.pojo.EvamData;
import com.example.examinationvolunteers.service.EvamDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EvamDataServiceImpl implements EvamDataService {
    @Autowired
    EvamDataMapper evamDataMapper;
    @Override
    public EvamData selectEvamData(Integer evamDataId) {
        return evamDataMapper.selectEvamData(evamDataId);
    }

    @Override
    public int insertEvamData(EvamData evamData) {
        evamDataMapper.insertEvamData(evamData);
        return 0;
    }

    @Override
    public int deleteEvamData(Integer evamDataId) {
        evamDataMapper.deleteEvamData(evamDataId);
        return 0;
    }

    @Override
    public List<EvamData> selectAll() {
        return evamDataMapper.selectAll();
    }

    @Override
    public int updataEvamData(EvamData evamData) {
        evamDataMapper.updataEvamData(evamData);
        return 0;
    }
}
