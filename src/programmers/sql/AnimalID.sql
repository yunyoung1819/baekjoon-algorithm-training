/**
 * 문제제목 : 이름이 있는 동물의 아이디
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/59407
 * 작 성 일 : 2019.11.24
 * 작 성 자 : YUN YOUNG
 * DB : MySQL
 * 
 * 문제설명 : 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL문을 작성해주세요.
 * 단, ID는 오름차순 정렬되어야 합니다.
 **/

SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID;