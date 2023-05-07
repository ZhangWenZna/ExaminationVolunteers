package com.example.examinationvolunteers.service.impl;

import com.example.examinationvolunteers.mapper.RecommendationMapper;
import com.example.examinationvolunteers.pojo.Recommendation;
import com.example.examinationvolunteers.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecommendationServiceImpl implements RecommendationService {
    @Autowired
    RecommendationMapper recommendationMapper;
    @Override
    public Recommendation selectRecommendation(Integer recommendationId) {
        return recommendationMapper.selectRecommendation(recommendationId);
    }

    @Override
    public int insertRecommendation(Recommendation recommendation) {
        recommendationMapper.insertRecommendation(recommendation);
        return 0;
    }

    @Override
    public int deleteRecommendation(Integer recommendationId) {
        recommendationMapper.deleteRecommendation(recommendationId);
        return 0;
    }

    @Override
    public List<Recommendation> selectAll() {
        return recommendationMapper.selectAll();
    }

    @Override
    public int updataRecommendation(Recommendation recommendation) {
        recommendationMapper.updataRecommendation(recommendation);
        return 0;
    }
}
