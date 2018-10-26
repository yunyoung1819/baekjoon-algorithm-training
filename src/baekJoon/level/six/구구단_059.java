package baekJoon.level.six;

import java.util.Scanner;

/**
 * 문제번호 :2739번
 * 문제제목 : 구구단
 * 작 성 자 : Ryan Yun
 * 
 * 문제내용 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
 * 출력 형식에 맞춰서 출력하면 된다.
 * 
 * 입   력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출   력 : 출력형식과 같게 N*1 부터 N*9 까지 출력한다.
 */
public class 구구단_059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i <= n; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		sc.close();
	}
}
