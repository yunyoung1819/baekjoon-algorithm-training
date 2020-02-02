package programmers.level.two;

import java.util.Scanner;

/**
 * 문제번호 : Level 2.
 * 문제제목 : 피보나치 수 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12945
 * 작 성 일 : 2020.02.03
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 피보나치 수는 F(0)=0, F(1)=1일 때, 1이상의 n에 대하여 F(n)=F(n-1)+F(n-2)가 적용되는 수 입니다.
 * 
 * 예를 들어
 * F(2) = F(0) + F(1) = 0 + 1 = 1
 * F(3) = F(1) + F(2) = 1 + 1 = 2
 * F(4) = F(2) + F(3) = 1 + 2 = 3
 * F(5) = F(3) + F(4) = 2 + 3 = 5
 * 와 같이 이어집니다.
 * 
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해주세요.
 * 
 * 제한사항
 * n은 1 이상, 100000이하인 자연수입니다.
 *
 */
public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(getFibonacci(n));
		
		sc.close();
	}
	
	public static int getFibonacci(int n) {
		int answer = 0;
		long[] pibonacci = new long[n+1];
		pibonacci[0] = 0L;
		pibonacci[1] = 1L;
		
		for (int i = 2; i <= n; i++) {
			pibonacci[i] = (pibonacci[i-1] + pibonacci[i-2]) %1234567L;
		}
		
		answer = (int)(pibonacci[n]);
		
		return answer;
	}
}
