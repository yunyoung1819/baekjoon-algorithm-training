package baekJoon.six;

import java.util.Scanner;

/**
 * 문제 번호 : 2750번
 * 문제 제목 : 수 정렬하기 
 * 작 성 자 : Ryan Yun
 * 문제 내용 : N 개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 * 입    력 : 첫째 줄에 수의 개수 N (1 <= N <= 1000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
 * 이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 
 * 출    력 : 첫째 줄부터 N 개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 * 선택정렬이란?
 * 제자리 정렬 알고리즘의 하나로, 전체 원소들 중에서 기준 위치에 맞는 원소를 선택하여 자리를 교환하는 방식
 * 
 * 1. 주어진 원소 중 최소값을 찾는다.
 * 2. 그 값을 첫번째 원소와 교환 한다.
 * 3. 그 다음 작은 원소를 찾아 다음 위치의 원소와 비교하여 교환한다.
 * 
 * 위 과정을 반복하는 것이 선택정렬이다.
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
	    int indexMin; // 최소값을 가진 데이터의 인덱스 저장 변수 
		int temp;     // 임시 변수
		
		for(int j = 0; j < data.length-1; j++) {  // [5,4,3,2,1]
			indexMin = j;
			for(int k = j+1; k < data.length; k++) {
				// 선택원소보다 작은 원소 위치 찾기
			    if(data[k] < data[indexMin]) {
			    	indexMin = k;
			    }
			}
			temp = data[indexMin]; 	  // 최소값 임시저장
			data[indexMin] = data[j]; // 최소값 위치에 선택위치의 원소와 교환
			data[j] = temp; 		  // 선택 위치에 최소값 교환 
		}
	}
}
