package com.example.examinationvolunteers.mapper;

import com.example.examinationvolunteers.pojo.Recommendation;
import com.example.examinationvolunteers.pojo.School;


import java.util.List;

public interface RecommendationMapper {
    Recommendation selectRecommendation(Integer schoolId);
    int insertRecommendation(School user);
    int deleteRecommendation(Integer schoolId);
    List<Recommendation> selectAll();
    int updataRecommendation(School user);
}
