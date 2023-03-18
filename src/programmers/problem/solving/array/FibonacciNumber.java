package programmers.problem.solving.array;

import java.util.Scanner;

/**
 * 문제제목: 피보나치 수열
 * 작 성 자: yun young
 * 문제설명: 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *         2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13 을 출력하면 된다.
 * 입력설명: 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * 출력설명: 첫 줄에 피보나치 수열을 출력합니다.
 */
public class FibonacciNumber {
	private void solution(int n) {
		int[] fibonacci = new int[n];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
		}
		for (int i : fibonacci) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		FibonacciNumber fibonacciNumber = new FibonacciNumber();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibonacciNumber.solution(n);
		sc.close();
	}
}
