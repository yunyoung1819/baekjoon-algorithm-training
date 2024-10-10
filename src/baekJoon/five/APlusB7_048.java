package baekJoon.five;

import java.util.Scanner;

/**
 * 문제번호 : 11021번
 * 문제제목 : A+B - 7
 * 작 성 자 : Ryan Yun
 * 문제내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출    력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 *  
 */
public class APlusB7_048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 테스트 케이스의 개수 T
		int a = 0, b = 0, result = 0;
		
		for(int i = 1; i <= t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			result = a + b;
			System.out.println("Case #" + i + ": " + result);
		}
		
		sc.close();
	}
}
