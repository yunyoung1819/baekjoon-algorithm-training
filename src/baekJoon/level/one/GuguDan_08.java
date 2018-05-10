package baekJoon.level.one;

import java.util.Scanner;

/**
 * 문제번호 : 2739번
 * 문제내용 : 구구단
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 
 * 출력형식에 맞춰서 출력하면 된다.
 * 
 * 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출력 : 출력형식과 같게 N * 1 부터 N * 9 까지 출력한다.
 */
public class GuguDan_08 {
	public static void main(String[] args) {
		
		int danNumber = 0;

		Scanner scanner = new Scanner(System.in);
		danNumber = scanner.nextInt();
		
		for(int i = danNumber; i <= danNumber; i++){
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j +" = " + (i*j));
			}
		}
		
	}
}
