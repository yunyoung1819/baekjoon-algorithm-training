package programmers.challenge;

/**
 * 문제제목 : 두 정수 사이의 합
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12912
 * 작 성 일 : 2019.04.28
 * 작 성 자 : yun young
 * 문제설명 : 두 정수 a,b 가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a=3, b=5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 * 
 * 제한조건 
 * a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
 * a와 b의 대소관계는 정해져있지 않습니다. 
 */
public class Solution3 {
	public long solution(int a, int b) {
		int num1 = a;
		int num2 = b;
		long answer = 0;
		
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1; i <= num2; i++) {
			answer += i;
		}
		
		return answer;
	}
}
