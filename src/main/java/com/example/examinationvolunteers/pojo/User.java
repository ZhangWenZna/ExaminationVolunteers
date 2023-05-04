package com.example.examinationvolunteers.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 用户表
 */
@Data
@Component
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String password;
    private String userType;

}
