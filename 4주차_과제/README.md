## [4주차 과제](https://github.com/pia01190/comento-bootcamp/tree/main/4%EC%A3%BC%EC%B0%A8_%EA%B3%BC%EC%A0%9C)
**개발 완성**
- API 개발 (코드 작성)
- API 가이드 문서 작성 (README)

<br>

## 1. 월별 접속자 수
- 요청 URL

http://localhost:8031/api/v1/visitors/{year}/{month}
<br>

- Request Parameters

| Name  | Type   | Description            | Mandatory | Note  |
|-------|--------|------------------------|-----------|-------|
| year  | String | 조회할 연도 마지막 두 자리 | Yes       | ex) 20 |
| month | String | 조회할 월              | Yes       | ex) 06 |

<br>

- Response Parameters

| Name     | Type   | Description       |
|----------|--------|-------------------|
| yearMonth| String | 조회한 연도와 월  |
| totCnt   | Int    | 월별 접속자 수    |

<br>

- Response Body
<img src="https://github.com/user-attachments/assets/affff0bf-034b-43e1-b9ef-b20a971311a0" width="250" height="100"/>

<br>
<br>

## 2. 일자별 접속자 수
- 요청 URL

http://localhost:8031/api/v1/visitors/{month}/{day}
<br>

- Request Parameters

| Name  | Type   | Description            | Mandatory | Note  |
|-------|--------|------------------------|-----------|-------|
| year  | String | 조회할 연도 마지막 두 자리 | Yes       | ex) 20 |
| month | String | 조회할 월              | Yes       | ex) 06 |
| day   | String | 조회할 일              | Yes       | ex) 22 |

<br>

- Response Parameters

| Name     | Type   | Description         |
|----------|--------|---------------------|
| yearMonth| String | 조회한 연도, 월, 일 |
| totCnt   | Int    | 일자별 접속자 수    |

<br>

- Response Body
<img src="https://github.com/user-attachments/assets/d4caf8de-ecd9-409b-8909-8330f65eafcf" width="250" height="100"/>

<br>
<br>

## 3. 평균 하루 로그인 수
- 요청 URL

http://localhost:8031/api/v1/avg-logins/{year}/{month}
<br>

- Request Parameters

| Name  | Type   | Description            | Mandatory | Note  |
|-------|--------|------------------------|-----------|-------|
| year  | String | 조회할 연도 마지막 두 자리 | Yes       | ex) 20 |
| month | String | 조회할 월              | Yes       | ex) 06 |

<br>

- Response Parameters

| Name     | Type   | Description       |
|----------|--------|-------------------|
| avgDayCnt| Double | 평균 하루 로그인 수 |

<br>

- Response Body
<img src="https://github.com/user-attachments/assets/1210ae05-b820-4927-8ff2-4d49e4b9fee0" width="250" height="100"/>

<br>
<br>

## 4. 휴일을 제외한 로그인 수
- 요청 URL

http://localhost:8031/api/v1/avg-logins/non-holiday-logins/{year}/{month}
<br>

- Request Parameters

| Name  | Type   | Description            | Mandatory | Note  |
|-------|--------|------------------------|-----------|-------|
| year  | String | 조회할 연도 마지막 두 자리 | Yes       | ex) 20 |
| month | String | 조회할 월              | Yes       | ex) 06 |

<br>

- Response Parameters

| Name     | Type   | Description         |
|----------|--------|---------------------|
| totCnt   | Int    | 휴일을 제외한 로그인 수 |

<br>

- Response Body
<img src="https://github.com/user-attachments/assets/869139a5-dbbf-4899-bb5b-f842f3442dd9" width="280" height="100"/>

<br>
<br>

## 5. 부서별 월별 로그인 수
- 요청 URL

http://localhost:8031/api/v1/department-logins/{year}/{month}
<br>

- Request Parameters

| Name  | Type   | Description            | Mandatory | Note  |
|-------|--------|------------------------|-----------|-------|
| year  | String | 조회할 연도 마지막 두 자리 | Yes       | ex) 20 |
| month | String | 조회할 월              | Yes       | ex) 06 |

<br>

- Response Parameters

| Name          | Type   | Description               |
|---------------|--------|---------------------------|
| departmentName| String | 부서명                    |
| yearMonth     | String | 조회한 연도와 월          |
| totCnt        | Int    | 부서별 월별 로그인 수     |

<br>

- Response Body
<img src="https://github.com/user-attachments/assets/affff0bf-034b-43e1-b9ef-b20a971311a0" width="250" height="100"/>
