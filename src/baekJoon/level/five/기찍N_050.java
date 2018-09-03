package baekJoon.level.five;

import java.util.Scanner;

/**
 * 문제번호 : 2742번
 * 문제제목 : 기찍 N
 * 작 성 자 : Ryan Yun
 * 문제내용 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 출    력 : 첫째 줄부터 N번째 줄까지 차례대로 출력한다.
 *
 */
public class 기찍N_050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();    // 자연수 N
		
		if (n > 100000) {		 // N이 100,000보다 큰 경우
			n = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(n-i);
		}
		
		sc.close();
	}
}
