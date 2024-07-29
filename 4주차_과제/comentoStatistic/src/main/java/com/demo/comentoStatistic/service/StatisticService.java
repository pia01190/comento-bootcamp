package com.demo.comentoStatistic.service;

import com.demo.comentoStatistic.dao.StatisticMapper;
import com.demo.comentoStatistic.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticService {

    @Autowired
    StatisticMapper statisticMapper;

    // 년도별 로그인 수
    public YearCountDto getYearLogins(String year){
        return statisticMapper.selectYearLogin(year);
    }

    // 월별 로그인 수
    public YearMonthCountDto getYearMonthLogins(String year, String month){
        return statisticMapper.selectYearMonthLogin(year + month);
    }

    // 월별 접속자 수
    public YearMonthCountDto getYearMonthVisitors(String year, String month){
        return statisticMapper.selectYearMonthVisitors(year + month);
    }

    // 일자별 접속자 수
    public YearMonthDayCountDto getYearMonthDayVisitors(String year, String month, String day){
        return statisticMapper.selectYearMonthDayVisitors(year + month + day);
    }

    // 평균 하루 로그인 수
    public AvgDayLoginDto getAvgDayLogins(String year, String month){
        return statisticMapper.selectAvgDayLogins(year + month);
    }

    // 휴일을 제외한 로그인 수
    public NonHolidayDto getNonHolidayLogins(String year, String month){
        return statisticMapper.selectNonHolidayLogins(year + month);
    }

    // 부서별 월별 로그인 수
    public DepartmentMonthLoginDto getDepartmentMonthLogins(String year, String month){
        return statisticMapper.selectDepartmentMonthLogins(year + month);
    }
}
