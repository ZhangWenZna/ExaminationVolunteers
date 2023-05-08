package com.example.examinationvolunteers.controller;

import com.example.examinationvolunteers.pojo.Major;
import com.example.examinationvolunteers.pojo.School;
import com.example.examinationvolunteers.service.MajorService;
import com.example.examinationvolunteers.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class MajorController {
    @Autowired
    MajorService majorService;
    @RequestMapping("/selectMajor")
    public Major selectMajor(Integer id){
        return majorService.selectMajor(id);
    }
    @RequestMapping("/deleteMajor")
    public String deleteMajor(Integer id){
        Integer validation=majorService.deleteMajor(id);
        if (validation==1){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("/selectAllMajor")
    public List<Major> selectAllMajor(){
        return majorService.selectAll();
    }
    @RequestMapping("/updataMajor")
    public String updataSchool(Major major){
        Integer validation=majorService.updataMajor(major);
        if (validation==1){
            return "修改成功";
        }
        return "修改失败";
    }
    @RequestMapping("/insertMajor")
    public String insertMajor(Major major){
        Integer validation=majorService.insertMajor(major);
        if (validation==1){
            return "添加成功";
        }
        return "添加失败";
    }
}
