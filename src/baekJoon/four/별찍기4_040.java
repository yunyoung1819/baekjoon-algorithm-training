package baekJoon.four;

import java.util.Scanner;

/**
 * 문제번호 : 2441번
 * 문제제목 : 별찍기 - 4
 * 작 성 자 : Yun Young
 * 문제내용 : 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 하지만 오른쪽을 기준으로 정렬한 별을 출력하시오.
 * 
 * 입    력 : 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 출    력 : 첫째 줄부터 N번째 줄 까지 차례대로 별을 출력한다.
 * 출력모양 : *****
            ****
             ***
              **
               *
 *
 */
public class 별찍기4_040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i <= j) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}
