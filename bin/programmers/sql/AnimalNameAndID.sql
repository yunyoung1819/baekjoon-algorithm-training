/**
 * 문제제목 : 동물의 아이디와 이름
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/59403
 * 작 성 일 : 2019.10.27
 * 작 성 자 : YUN YOUNG
 * 
 * 문제설명 : 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID 순으로 조회하는
 * SQL문을 작성해주세요. 
 */

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;