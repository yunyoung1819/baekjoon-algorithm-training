package programmers.algorithm_solving.array;

import java.util.Scanner;

/**
 * 문제 제목: 1. 큰 수 출력하기
 * 문제 설명: N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요. (첫 번째 수는 무조건 출력한다)
 * 입      력: 첫 줄에 자연수 N(1 <= N <= 100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 * 출      력: 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 * 
 * 예시 입력 
 * 6
 * 7 3 9 5 6 12
 * 
 * 예시 출력
 * 7 9 6 12
 * 
 * Problem Title: 1. Print a large number
 * Problem Description: Write a program that receives N integers and outputs only the number larger than the number immediately preceding you. 
 * 						(The first number is unconditionally printed.)
 * Input: The first line is given a natural number N (1 <= N <= 100), followed by N integers.
 * Output: Only the number larger than your immediate predecessor is printed on a single line.
 *  
 * Enter an example
 * 6
 * 7 3 9 5 6 12
 * 
 * Example Output
 * 7 9 6 12
 */
public class LargeNumber {
	private void solution(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i == 0) {
				System.out.print(arr[0]  + " ");
			} else if (arr[i] > arr[i-1]) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		LargeNumber largeNumber = new LargeNumber();
		largeNumber.solution(arr);
		sc.close();
	}
}
