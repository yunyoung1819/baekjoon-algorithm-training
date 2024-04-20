package programmers.algorithm_solving.sorting;

import java.util.Scanner;

/**
 * 문제 제목: 버블 정렬
 * 문제 설명: N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 버블정렬입니다.
 * 
 * 입  력: 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * 출  력: 오름차순으로 정렬된 수열을 출력합니다.
 * 예시 입력:  6
 * 			13 5 11 7 23 15
 * 예시 출력:  5 7 11 13 15 23
 * @author yunyoung
 *
 */
public class BubbleSort {
	public int[] sorting(int n, int[] arr) {
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : bubbleSort.sorting(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
