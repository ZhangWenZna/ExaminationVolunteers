package com.example.examinationvolunteers.service.impl;

import com.example.examinationvolunteers.mapper.MajorMapper;
import com.example.examinationvolunteers.pojo.Major;
import com.example.examinationvolunteers.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorMapper majorMapper;
    @Override
    public Major selectMajor(Integer majorId) {
        return majorMapper.selectMajor(majorId);
    }

    @Override
    public int insertMajor(Major major) {
        majorMapper.insertMajor(major);
        return 0;
    }

    @Override
    public int deleteMajor(Integer majorId) {
        majorMapper.deleteMajor(majorId);
        return 0;
    }

    @Override
    public List<Major> selectAll() {
        return majorMapper.selectAll();
    }

    @Override
    public int updataMajor(Major major) {
        majorMapper.updataMajor(major);
        return 0;
    }
}
