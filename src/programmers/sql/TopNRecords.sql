/**
 * 문제제목 : 상위 n개 레코드
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/59405
 * 작 성 일 : 2019.10.28
 * 작 성 자 : YUN YOUNG
 * S Q L : MySQL
 * 
 * 문제설명 : 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.
 **/

SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME ASC
LIMIT 1;