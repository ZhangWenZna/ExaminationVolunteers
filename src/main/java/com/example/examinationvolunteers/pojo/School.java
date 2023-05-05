package com.example.examinationvolunteers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 学校表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class School {
    /**
    学校Id
     */
    private Integer schoolId;
    /**
     学校地址（省）
     */
    private String province;
    /**
     学校名字
     */
    private String schoolName;
    /**
     学校类型（985，211，普通本科）
     */
    private String schoolType;
    /**
     学校层次（专科，本科）
     */
    private String schoolLevel;

    public School(){}
}
