package com.demo.comentoStatistic.controller;

import com.demo.comentoStatistic.dto.*;
import com.demo.comentoStatistic.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatisticController {

    @Autowired
    StatisticService statisticService;

    // 년도별 로그인 수
    @RequestMapping(value="/api/v1/logins/{year}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<YearCountDto> getYearLoginCount(@PathVariable("year") String year){
        return ResponseEntity.ok(statisticService.getYearLogins(year));
    }

    // 월별 로그인 수
    @RequestMapping(value="/api/v1/logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<YearMonthCountDto> getYearMonthLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){
        return ResponseEntity.ok(statisticService.getYearMonthLogins(year, month));
    }

    // 월별 접속자 수
    @RequestMapping(value="/api/v1/visitors/{year}/{month}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<YearMonthCountDto> getYearMonthVisitorCount(@PathVariable("year") String year, @PathVariable("month") String month){
        return ResponseEntity.ok(statisticService.getYearMonthVisitors(year, month));
    }

    // 일자별 접속자 수
    @RequestMapping(value="/api/v1/visitors/{year}/{month}/{day}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<YearMonthDayCountDto> getYearMonthDayVisitorCount(@PathVariable("year") String year, @PathVariable("month") String month, @PathVariable("day") String day){
        return ResponseEntity.ok(statisticService.getYearMonthDayVisitors(year, month, day));
    }

    // 평균 하루 로그인 수
    @RequestMapping(value="/api/v1/avg-logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<AvgDayLoginDto> getAvgDayLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){
        return ResponseEntity.ok(statisticService.getAvgDayLogins(year, month));
    }

    // 휴일을 제외한 로그인 수
    @RequestMapping(value="/api/v1/non-holiday-logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<NonHolidayDto> getNonHolidayLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){
        return ResponseEntity.ok(statisticService.getNonHolidayLogins(year, month));
    }

    // 부서별 월별 로그인 수
    @RequestMapping(value="/api/v1/department-logins/{year}/{month}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<DepartmentMonthLoginDto> getDepartmentMonthLoginCount(@PathVariable("year") String year, @PathVariable("month") String month){
        return ResponseEntity.ok(statisticService.getDepartmentMonthLogins(year, month));
    }
}
