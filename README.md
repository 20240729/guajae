API 명세서
----------------
| 기능          | Method | URL                | request | response | 상태코드        |
|-------------|--------|--------------------|---------|----------|-------------|
| 저장          | POST   | /api/schedule      | body    | 등록 정보    | 200 : 정상 등록 |
| 단건 조회       | GET    | /api/schedule/{id} | -       | 단건 응답 정보 | 200 : 정상 조회 |
|  수정 | PUT    | /api/schedule/{id} | body | 수정 정보    | 200 : 정상 수정 |
|  |     |       |         |          |  |
------------------------------------
일정

| 일정ID        | Long     | NOT NULL |
|-------------|----------|------|
| 작성 유저ID     | Long     | NOT NULL |
| 배치된 담당 유저ID | Long     | NULL |
| 할일 제목       | String   | NOT NULL |
| 할일 내용       | String   | NOT NULL |
| 작성일         | Datetime | NOT NULL |
| 수정일         | Datetime | NOT NULL |
----------------
댓글

| 댓글ID | Long     | NOT NULL | 
|------|----------|----------|
| 유저ID | Long     | NOT NULL | 
| 내용   | String   | NOT NULL |
| 작성일  | Datetime | NOT NULL |
| 수정일  | Datetime | NOT NULL |
---------------------
유저

| 유저ID | Long   | NOT NULL | 
|------|--------|----------|
| 이름   | String | NOT NULL |
| 이메일  | String | NOT NULL |
| 작성일  | Datetime | NOT NULL |
| 수정일  | Datetime | NOT NULL |
---------------------
일정 : 유저 = N : M  
유저 : 댓글 = 1 : N  
일정 : 댓글 = 1 : N  
