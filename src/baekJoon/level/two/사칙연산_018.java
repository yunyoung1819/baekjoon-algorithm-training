package baekJoon.level.two;

import java.util.Scanner;

/**
 * 문제번호 : 10869번
 * 문제제목 : 사칙연산
 * 문제내용 : 두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 * 입력: 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000) 
 * 출력: 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 *
 */
public class 사칙연산_018 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a >= 1 && b <= 10000){
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
		}
		
	}
}
