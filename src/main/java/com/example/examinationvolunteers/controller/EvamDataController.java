package com.example.examinationvolunteers.controller;

import com.example.examinationvolunteers.pojo.EvamData;
import com.example.examinationvolunteers.service.EvamDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/evamData")
public class EvamDataController {
    @Autowired
    EvamDataService evamDataService;
    @RequestMapping("/selectEvamData")
    public EvamData selectExaminee(Integer id){
        return evamDataService.selectEvamData(id);
    }
    @RequestMapping("/deleteEvamData")
    public String deleteEvamData(Integer id){
        Integer validation=evamDataService.deleteEvamData(id);
        if (validation==1){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("/selectAllEvamData")
    public List<EvamData> selectAllEvamData(){
        return evamDataService.selectAll();
    }
    @RequestMapping("/updataEvamData")
    public String updataEvamData(EvamData evamData){
        Integer validation=evamDataService.updataEvamData(evamData);
        if (validation==1){
            return "修改成功";
        }
        return "修改失败";
    }
    @RequestMapping("/insertEvamData")
    public String insertEvamData(EvamData evamData){
        Integer validation=evamDataService.insertEvamData(evamData);
        if (validation==1){
            return "添加成功";
        }
        return "添加失败";
    }
}
