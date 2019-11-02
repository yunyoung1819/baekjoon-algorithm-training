/**
 * 문제제목 : 고양이와 개는 몇 마리 있을까
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/59040
 * 작 성 일 : 2019.11.02
 * 작 성 자 : YUN YOUNG
 * 
 * 문제설명 : 동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문을 작성해주세요.
 * 이때 고양이가 개보다 먼저 조회해주세요.
 */

SELECT ANIMAL_TYPE, COUNT(*)
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE ASC;