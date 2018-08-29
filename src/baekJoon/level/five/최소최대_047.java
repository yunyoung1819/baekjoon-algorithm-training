package baekJoon.level.five;

import java.util.Scanner;

/**
 * 문제번호 : 10818번
 * 문제제목 : 최소, 최대
 * 작 성 자 : Ryan Yun
 * 문제내용 : N 개의 정수가 주어진다. 이 때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고 1,000,000보다 작거나 같은 정수이다.
 * 출    력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 예제입력 : 5
 * 20 10 35 30 7
 * 예쩨출력 : 7 35
 *
 */
public class 최소최대_047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		sc.nextLine();
		
		int[] arr = new int[n];
		String[] s = sc.nextLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		sc.close();
	}
}
