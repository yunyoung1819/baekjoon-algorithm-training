package baekJoon.two;

import java.util.Scanner;

/**
 * 문제번호 : 10430번
 * 문제제목 : 나머지
 * 문제내용 : (A+B)%C 는 (A%C + B%C)%C와 같을까?
 * (AXB)%C 는 (A%C X B%C)%C와 같을까?
 * 세 수 A, B, C가 주어졌을 때 위의 네가지 값을 구하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A,B,C가 순서대로 주어진다.  (2 ≤ A, B, C ≤ 10000)
 * 출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 *
 */
public class 나머지_020 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if((a >= 2 && b >= 2 && c >= 2) && (a <= 10000 && b <= 10000 && c <= 10000)) {
			System.out.println((a + b) % c);
			System.out.println((a % c + b % c) % c);
			System.out.println((a * b) % c);
			System.out.println((a % c * b % c) % c);
		}
	}
}
