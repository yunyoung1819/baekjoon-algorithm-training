package baekJoon.level.eight;

import java.util.Scanner;

/**
 * 문제번호 : 2747번
 * 문제제목 : 피보나치 수
 * 작 성 일 : 2019.04.13
 * 작 성 자 : yun young
 * 
 * 문제내용 : 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
 * 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
 * n = 17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 6, 13, 21, 34, 55, 899, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.
 * 출   력 : 첫째 줄에 n번째 피보나치 수를 출력한다.
 *
 */
public class Solution2747 {
	int[] memo = new int[100];
	
	public static void main(String[] args) {
		Solution2747 solution = new Solution2747();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		memo[n] = fibonacci(n);
		System.out.println(memo[n]);
		sc.close();
	}
	
	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			if (memo[n] > 0) {
				return memo[n];
			}
			memo[n] = fibonacci(n-1) + fibonacci(n-2);
			return memo[n];
		}
	}
}
