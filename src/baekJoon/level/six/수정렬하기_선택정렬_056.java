package baekJoon.level.six;

import java.util.Scanner;

/**
 * 문제 번호 : 2750번
 * 문제 제목 : 수 정렬하기 
 * 작 성 자 : Ryan Yun
 * 문제 내용 : N 개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 * 입    력 : 첫째 줄에 수의 개수 N (1<= N <= 1000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
 * 이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 
 * 출    력 : 첫째 줄부터 N 개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
public class 수정렬하기_선택정렬_056 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();  // 수의 개수 N
		int[] data = new int[n];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = input.nextInt();
		}
		
		// 선택 정렬 
		selectionSort(data); 
	   
		for(int l = 0; l < data.length; l++) {
			System.out.println(data[l]);
		}
		
		input.close();
	}

	private static void selectionSort(int[] data) {
		int temp;
		for(int j = 0; j < data.length; j++) {  // [5,4,3,2,1]
			for(int k = 0; k < data.length - 1; k++) {
				if(data[k] > data[k+1]) {
					temp = data[k];       // temp = 5
					data[k] = data[k+1];  // data[k] = 4
					data[k+1] = temp;     // data[k+1] = 5
				}
			}
		}
	}
}
