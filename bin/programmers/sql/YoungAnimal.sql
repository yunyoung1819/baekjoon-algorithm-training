/**
 * 문제제목: 어린 동물 찾기
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/59037
 * 작 성 일 : 2019.10.26
 * 작 성 자 : YUN YOUNG
 * 
 **/
         
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID ASC;