package programmers.challenge;

/**
 * 문제제목 : 약수의 합
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12928
 * 작 성 일 : 2019.05.06
 * 작 성 자 : yun young
 * 문제설명 : 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * 제한사항 : n은 0 이상 3000 이하인 자연수입니다.
 *
 */
public class SumOfDivisor {
	// test code
	public static void main(String[] args) {
		SumOfDivisor d = new SumOfDivisor();
		int n = 12;
		d.divisor(n);
	}
	
	public int divisor(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		
		System.out.println(answer);
		return answer;
	}
}
