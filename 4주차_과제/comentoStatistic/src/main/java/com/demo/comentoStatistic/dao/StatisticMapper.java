package com.demo.comentoStatistic.dao;

import com.demo.comentoStatistic.dto.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StatisticMapper {

    YearCountDto selectYearLogin(String year);
    YearMonthCountDto selectYearMonthLogin(String yearMonth);
    YearMonthCountDto selectYearMonthVisitors(String yearMonth);
    YearMonthDayCountDto selectYearMonthDayVisitors(String yearMonthDay);
    AvgDayLoginDto selectAvgDayLogins(String yearMonth);
    NonHolidayDto selectNonHolidayLogins(String yearMonth);
    DepartmentMonthLoginDto selectDepartmentMonthLogins(String yearMonth);
}
