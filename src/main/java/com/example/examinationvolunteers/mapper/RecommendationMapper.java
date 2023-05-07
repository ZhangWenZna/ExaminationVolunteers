package com.example.examinationvolunteers.mapper;

import com.example.examinationvolunteers.pojo.Recommendation;
import com.example.examinationvolunteers.pojo.School;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface RecommendationMapper {
    Recommendation selectRecommendation(Integer recommendationId);
    int insertRecommendation(Recommendation recommendation);
    int deleteRecommendation(Integer recommendationId);
    List<Recommendation> selectAll();
    int updataRecommendation(Recommendation recommendation);
}
