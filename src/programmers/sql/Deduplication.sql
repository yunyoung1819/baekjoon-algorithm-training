/**
 * 문제제목 : 중복 제거하기
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/59408
 * 작 성 일 : 2019.11.02
 * 작 성 자 : yun young
 * DB: MySQL
 * 
 * 문제내용 : ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. 
 * ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME,
 * INTAKE_CONDITION, NAME, SEX_UPON_INTAKE 는 각각 동물의 아이디, 생물 종,
 * 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.
 * 
 * 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL문을 작성해주세요.
 * 이때 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 칩니다.
 **/

SELECT COUNT(DISTINCT NAME) AS COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;