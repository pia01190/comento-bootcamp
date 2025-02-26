## [3주차 과제](https://github.com/pia01190/comento-bootcamp/tree/main/3%EC%A3%BC%EC%B0%A8_%EA%B3%BC%EC%A0%9C)
**REST API 실습**
- 스프링 VS 스프링부트
- 간단한 API 개발

<br>

## 1. 스프링부트 개발 환경 셋팅
- spring.io에 접속하여 프로젝트 생성
<br>
(dependencies - lombok, Spring web, spring boot devTools)
<br>
<img src="https://github.com/user-attachments/assets/dc17a81e-3d7c-40bf-aa7c-28d097b5f27d" width="600" height="350"/>

<br>
<br>

- 프로젝트 생성 및 프로젝트 실행
<img src="https://github.com/user-attachments/assets/3ac50554-fde4-4b33-bcf9-c714b91f8d01" width="180" height="400"/>

<br>
<br>

- PingController 실행
<img src="https://github.com/user-attachments/assets/3f862407-15f6-4367-8b93-5b2d85a5c68c" width="200" height="100"/>

<br>
<br>

## 2. 통계 API(SW활용현황)을 위한 DB, TABLE 생성
- debeaver 이용하여 TABLE 생성
<img src="https://github.com/user-attachments/assets/891cb510-9aaa-411b-984a-20edb4de7e76" width="600" height="350"/>

<br>
<br>

## 3. [20년도 로그인 수 API] 스프링부트, mybatis, mariadb 연동
- localhost:8031/api/v1/logins/20 결과
<img src="https://github.com/user-attachments/assets/18c502d1-e102-4e69-947d-2d2ca3354a3a" width="230" height="100"/>

<br>
<br>

- localhost:8031/api/v1/logins/20/04 결과
<img src="https://github.com/user-attachments/assets/8577dfb5-56be-42b6-b7ca-46fb8f402205" width="250" height="100"/>

<br>
<br>

- 프로젝트 구조
<img src="https://github.com/user-attachments/assets/4aa579c7-2399-47ed-950e-d945f3017f38" width="180" height="400"/>

<br>
<br>

## 4. SW활용 현황 통계 API 구축을 위한 SQL 작성
- 월별 접속자 수
```
    SELECT SUBSTR(date, 1, 6) AS month, SUM(visitor_count) AS visitors
    FROM visitors
    WHERE SUBSTR(date, 1, 6) = '202406'
    GROUP BY month;
```
<br>

- 일자별 접속자 수
```
    SELECT CASE
        WHEN DATE_FORMAT(date, '%Y%m%d') = '20240601' THEN '조회된 날짜'
        ELSE '다른 날짜'
        END AS date_label, visitor_count AS visitors
    FROM visitors
    WHERE DATE_FORMAT(date, '%Y%m%d') = '20240601';
```
<br>

- 평균 하루 로그인 수
```
    SELECT
        :days AS days,
        ROUND(SUM(login_count) / COUNT(DISTINCT login_date), 2) AS avgDailyLogins
    FROM logins
    WHERE login_date >= DATE_SUB(CURDATE(), INTERVAL :days DAY);
```
<br>

- 휴일을 제외한 로그인 수
```
    SELECT SUM(login_count) AS excludeHolidayLogins
    FROM logins
    WHERE login_date NOT IN (
        SELECT holiday_date FROM holidays
    ) UNION SELECT 0 AS excludeHolidayLogins
    WHERE NOT EXISTS (
        SELECT 1 FROM logins WHERE login_date NOT IN (SELECT holiday_date FROM holidays)
    );
```
<br>

- 부서별 월별 로그인 
```
    SELECT department, SUBSTR(login_date, 1, 6) AS month,
        SUM(login_count) AS departmentLogins
    FROM logins
    WHERE SUBSTR(login_date, 1, 6) = '202406'
    GROUP BY department, month;
  ```
