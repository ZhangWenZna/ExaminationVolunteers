package com.example.examinationvolunteers.service;

import com.example.examinationvolunteers.pojo.Recommendation;

import java.util.List;

public interface RecommendationService {
    Recommendation selectRecommendation(Integer recommendationId);
    int insertRecommendation(Recommendation recommendation);
    int deleteRecommendation(Integer recommendationId);
    List<Recommendation> selectAll();
    int updataRecommendation(Recommendation recommendation);
}
