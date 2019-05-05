package programmers.level.one;

/**
 * 문제제목 : 짝수와 홀수
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12937
 * 작 성 일 : 2019.05.04
 * 작 성 자 : yun young
 * 
 * 문제설명 : 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, 
 * solution을 완성해주세요.
 * 
 * 제한조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다. 
 */
class Solution9 {
	public String solution(int num) {
		return num%2 == 0 ? "Even" : "Odd";
	}
}
