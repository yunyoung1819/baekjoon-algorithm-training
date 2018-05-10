package baekJoon.level.one;

import java.util.Scanner;

/**
 * 별찍기 - 1
 * 
 * 문제번호 : 2438번
 * 풀이날짜 : 2018.04.30
 * 작성자 : 윤영
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 입력 : 첫째 줄에 N(1<=N<=100) 이 주어진다.
 * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 */
public class 별찍기1_07 {
	public static void main(String[] args) {
		int inputNum = 0;
		Scanner scanner = new Scanner(System.in);	
		inputNum = scanner.nextInt();

		if(inputNum >= 1 && inputNum <= 100) {
			for(int i = 0; i < inputNum; i++){
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
