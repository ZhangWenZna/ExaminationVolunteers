package com.example.examinationvolunteers;

import com.example.examinationvolunteers.mapper.SchoolMapper;
import com.example.examinationvolunteers.mapper.UserMapper;
import com.example.examinationvolunteers.pojo.School;
import com.example.examinationvolunteers.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExaminationVolunteersApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    SchoolMapper schoolMapper;
    @Test
    void contextLoads() {
        //School school =new School();

        //System.out.println();
        //userMapper.insertUser();
        //userMapper.deleteUser(2);
        //userMapper.updataUser(user);
        System.out.println(schoolMapper.selectAll());
    }

}
