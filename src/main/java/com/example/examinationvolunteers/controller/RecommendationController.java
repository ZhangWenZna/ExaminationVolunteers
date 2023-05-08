package com.example.examinationvolunteers.controller;

import com.example.examinationvolunteers.pojo.Recommendation;
import com.example.examinationvolunteers.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recommendation")
public class RecommendationController {
    @Autowired
    RecommendationService recommendationService;
    @RequestMapping("/selectRecommendation")
    public Recommendation selectRecommendation(Integer id){
        return recommendationService.selectRecommendation(id);
    }
    @RequestMapping("/deleteRecommendation")
    public String deleteRecommendation(Integer id){
        Integer validation=recommendationService.deleteRecommendation(id);
        if (validation==1){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("/selectAllRecommendation")
    public List<Recommendation> selectAllRecommendationl(){
        return recommendationService.selectAll();
    }
    @RequestMapping("/updataRecommendation")
    public String updataRecommendation(Recommendation recommendation){
        Integer validation=recommendationService.updataRecommendation(recommendation);
        if (validation==1){
            return "修改成功";
        }
        return "修改失败";
    }
    @RequestMapping("/insertRecommendation")
    public String insertSchool(Recommendation recommendation){
        Integer validation=recommendationService.insertRecommendation(recommendation);
        if (validation==1){
            return "添加成功";
        }
        return "添加失败";
    }
}
