package com.example.examinationvolunteers.controller;

import com.example.examinationvolunteers.pojo.User;
import com.example.examinationvolunteers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/selectUser")
    public User selectUser(Integer id){
        return userService.selectUser(id);
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id){
        Integer validation=userService.deleteUser(id);
        if (validation==1){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping("/selectAllUSer")
    public List<User> selectAllUser(){
        return userService.selectAll();
    }
    @RequestMapping("/updataUser")
    public String updataUser(User user){
        Integer validation=userService.updataUser(user);
        if (validation==1){
            return "修改成功";
        }
        return "修改失败";
    }
    @RequestMapping("/insertUser")
    public String insertUser(User user){
        Integer validation=userService.insertUser(user);
        if (validation==1){
            return "添加成功";
        }
        return "添加失败";
    }


}
