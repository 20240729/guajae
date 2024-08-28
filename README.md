API 명세서
----------------
| 기능       | Method | URL                       | request | response  | 상태코드        |
|----------|--------|---------------------------|---------|-----------|-------------|
| 일정 저장    | POST   | /api/todos                | body    | 등록 정보     | 200 : 정상 등록 |
| 일정 단건 조회 | GET    | /api/todos/{todoId}       | -       | 단건 응답 정보  | 200 : 정상 조회 |
| 일정 수정    | PUT    | /api/todos/{todoId}       | body    | 수정 정보     | 200 : 정상 수정 |
| 댓글 저장    | POST   | /api/comments             | body    | 등록 정보     | 200 : 정상 등록 |
| 댓글 단건 조회 | GET    | /api/comments/{commentId} | -       | 단건 응답 정보  | 200 : 정상 조회 |
| 댓글 전체 조회 | GET    | /api/comments             | -       | 모든 댓글 리스트 | 200         |
| 댓글 수정    | PUT    | /api/comments/{commentId} | body    | 수정 정보     | 200         |
| 댓글 삭제    | DELETE | /api/comments/{commentId} | -       | -         | 200         |
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
