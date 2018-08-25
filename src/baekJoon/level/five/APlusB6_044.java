package baekJoon.level.five;

import java.util.Scanner;

/**
 * 문제번호 : 10953번
 * 문제제목 : A+B - 6
 * 작 성 자 : Ryan Yun
 * 문제내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 * 출    력 : 각 테스트 케이스마다 A+B를 출력한다.
 * 
 */
public class APlusB6_044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 0;		// 테스트 케이스의 개수 T
		String input;
		t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			input = sc.next();
			String a = input.substring(0,1);
			String b = input.substring(2);
			System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		}
		
		sc.close();
	}
}
