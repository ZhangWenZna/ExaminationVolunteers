package com.example.examinationvolunteers.controller;

import com.example.examinationvolunteers.pojo.Examinee;
import com.example.examinationvolunteers.service.ExamineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/examinee")
public class ExamineeController {
    @Autowired
    ExamineeService examineeService;
    @RequestMapping("/selectExaminee")
    public Examinee selectExaminee(Integer id){
        return examineeService.selectExaminee(id);
    }
    @RequestMapping("/deleteExaminee")
    public String deleteExaminee(Integer id){
        Integer validation=examineeService.deleteExaminee(id);
        if (validation==1){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("/selectAllExaminee")
    public List<Examinee> selectAllExaminee(){
        return examineeService.selectAll();
    }
    @RequestMapping("/updataExaminee")
    public String updataExaminee(Examinee examinee){
        Integer validation=examineeService.updataExaminee(examinee);
        if (validation==1){
            return "修改成功";
        }
        return "修改失败";
    }
    @RequestMapping("/insertExaminee")
    public String insertExaminee(Examinee examinee){
        Integer validation=examineeService.insertExaminee(examinee);
        if (validation==1){
            return "添加成功";
        }
        return "添加失败";
    }
}
