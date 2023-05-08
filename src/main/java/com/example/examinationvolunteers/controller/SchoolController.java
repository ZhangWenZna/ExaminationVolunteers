package com.example.examinationvolunteers.controller;

import com.example.examinationvolunteers.pojo.School;
import com.example.examinationvolunteers.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;
    @RequestMapping("/selectSchool")
    public School selectSchool(Integer id){
        return schoolService.selectSchool(id);
    }
    @RequestMapping("/deleteSchool")
    public String deleteSchool(Integer id){
        Integer validation=schoolService.deleteSchool(id);
        if (validation==1){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("/selectAllSchool")
    public List<School> selectAllSchool(){
        return schoolService.selectAll();
    }
    @RequestMapping("/updataSchool")
    public String updataSchool(School school){
        Integer validation=schoolService.updataSchool(school);
        if (validation==1){
            return "修改成功";
        }
        return "修改失败";
    }
    @RequestMapping("/insertSchool")
    public String insertSchool(School school){
        Integer validation=schoolService.insertSchool(school);
        if (validation==1){
            return "添加成功";
        }
        return "添加失败";
    }
}
