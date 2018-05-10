package baekJoon.level.one;

import java.util.Scanner;

/**
 * 문제번호 : 2439번
 * 문제제목 : 별찍기 - 2
 * 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 하지만 오른쪽을 기준으로 정렬한 별을 출력하시오.
 * 입력 : 첫째 줄에 N (1<=N<=100)이 주어진다.
 * 출력 : 첫째 줄부터 N 번째 줄 까지 차례대로 별을 출력한다.
 *
 */
public class 별찍기2_09 {
	public static void main(String[] args) {
		
		int inputNum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		inputNum = scanner.nextInt();
		
		if(inputNum >= 1 && inputNum <= 100){
            for(int i = inputNum; i >= 1; i--){
                for(int j = 1; j <= inputNum; j++) {
                    if(i > j){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            System.out.println("");
            }
        }
	}
}
