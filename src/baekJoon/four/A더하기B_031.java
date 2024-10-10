package baekJoon.four;

import java.util.Scanner;

/**
 * 문제번호 : 2558번
 * 문제제목 : A + B -2
 * 문제내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * 출    력 : 첫째 줄에 A+B를 출력한다.
 *
 */
public class A더하기B_031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		
		sc.close();
	}
}
