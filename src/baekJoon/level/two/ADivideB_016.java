package baekJoon.level.two;

import java.util.Scanner;

/**
 * 문제번호 : 1008번
 * 문제제목 : A/B
 * 문제내용 : A/B를 계산하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력 : 첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
 *
 */
public class ADivideB_016 {
	public static void main(String[] args) {
		
		double a = 0.0;
		double b = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		
		if(a > 0 && b < 10) {
			System.out.println(a/b);
		}else{
			System.out.println("입력오류");
		}
	}
}
