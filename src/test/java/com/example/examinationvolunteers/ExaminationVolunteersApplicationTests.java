package com.example.examinationvolunteers;

import com.example.examinationvolunteers.mapper.UserMapper;
import com.example.examinationvolunteers.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExaminationVolunteersApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(userMapper.selectUser(1));
    }

}
