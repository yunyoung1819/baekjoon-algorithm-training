/**
 * 문제제목 : 없어진 기록 찾기
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/59042
 * 작 성 일 : 2019.11.09
 * 작 성 자 : YUN YOUNG
 * DB: MySQL
 * 
 * 문제설명 : ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다.
 * ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME,
 * INTAKE_CONDITION, NAME, SEX_UPON_INTAKE 는 각각 동물의 아이디, 생물 종, 보호 시작일,
 * 보호 시작시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.
 * 
 * NAME	TYPE	NULLABLE
 * ANIMAL_ID	VARCHAR(N)	FALSE
 * ANIMAL_TYPE	VARCHAR(N)	FALSE
 * DATETIME	DATETIME	FALSE
 * INTAKE_CONDITION	VARCHAR(N)	FALSE
 * NAME	VARCHAR(N)	TRUE
 * SEX_UPON_INTAKE	VARCHAR(N)	FALSE
 * 
 * ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다.
 * ANIMAL_OUTS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE,
 * DATETIME, NAME, SEX_UPON_OUTCOM 는 각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및
 * 중성화 여부를 나타냅니다.
 * ANIMAL_OUTS 테이블의 ANIMAL_ID 는 ANIMAL_INS 의 ANIMAL_ID 의 외래키 입니다.
 * 
 * NAME	TYPE	NULLABLE
 * ANIMAL_ID	VARCHAR(N)	FALSE
 * ANIMAL_TYPE	VARCHAR(N)	FALSE
 * DATETIME	DATETIME	FALSE
 * NAME	VARCHAR(N)	TRUE
 * SEX_UPON_OUTCOME	VARCHAR(N)	FALSE
 * 
 * 천재지변으로 인해 일부 데이터가 유실되었습니다. 입양을 간 기록은 있는데, 보호소에 들어온 기록이 없는
 * 동물의 ID와 이름을 ID 순으로 조회하는 SQL 문을 작성해주세요.
 **/

SELECT OUTS.ANIMAL_ID, OUTS.NAME
FROM ANIMAL_INS AS INS
RIGHT JOIN ANIMAL_OUTS AS OUTS
ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
WHERE INS.ANIMAL_ID IS NULL
ORDER BY OUTS.ANIMAL_ID;
