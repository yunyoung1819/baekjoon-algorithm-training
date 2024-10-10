package baekJoon.three;

import java.util.Scanner;

/**
 * 문제번호 : 10872번
 * 문제제목 : 팩토리얼
 * 문제내용 : 0보다 크거나 같은 정수 N이 주어진다. 이 때, N!을 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
 * 출    력 : 첫째 줄에 N!을 출력한다.
 * 5! = 5 x 4 x 3 x 2 x 1 = 5 x 4!
 * 
 */
public class 팩토리얼_027 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int result = 1;
		
		for(int i = num; i >= 1; i--) {
			result *= i; 
		}
		
		System.out.println(result);
	}
}
