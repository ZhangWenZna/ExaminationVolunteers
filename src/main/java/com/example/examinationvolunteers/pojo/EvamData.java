package com.example.examinationvolunteers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 高考数据表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class EvamData {
    /**
     * 高考数据Id
     */
    private Integer dataId;
    /**
     * 高考数据所输学校Id
     */
    private Integer schoolId;
    /**
     * 高考数据年份
     */
    private Integer year;
    /**
     * 理科录取分数线
     */
    private Double science;
    /**
     * 文科录取分数线
     */
    private Double liberalArts;
}
