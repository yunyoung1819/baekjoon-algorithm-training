package baekJoon.level.three;

import java.util.Scanner;

/**
 * 문제번호 : 2440번
 * 문제제목 : 별찍기-3
 * 문제내용 : 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 입 력 : 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 출 력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 */
public class 별찍기3_021 {
	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		for(int i = n; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				if(j <= i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
