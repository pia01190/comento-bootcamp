package com.demo.comentoStatistic.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentMonthLoginDto {
    private String departmentName;
    private String yearMonth;
    private int totCnt;
}
