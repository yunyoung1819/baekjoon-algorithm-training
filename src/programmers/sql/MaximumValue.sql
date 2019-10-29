/**
 * 문제제목: 최댓값 구하기
 * 문제링크: https://programmers.co.kr/learn/courses/30/lessons/59415
 * 작 성 일: 2019.10.29
 * 작 성 자: YUN YOUNG
 * 
 * 문제설명: 가장 최근에 들어온 동물은 언제 들어왔는지 조회하는 SQL문을 작성해주세요.
 **/

SELECT DATETIME
FROM ANIMAL_INS
ORDER BY DATETIME DESC
LIMIT 1;