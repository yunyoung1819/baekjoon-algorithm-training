package baekJoon.level.nine;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 : 1920번 
 * 문제제목 : 수 찾기 
 * 문제링크 : https://www.acmicpc.net/problem/1920
 * 작 성 일 : 2019.07.20
 * 작 성 자 : yun young
 * 문제내용 : N개의 정수 A[1], A[2], ... , A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존쟇하는지 알아내는 프로그램을 작성하시오.
 * 입   력 : 첫째 줄에 자연수 N(1<=N<=100,000)이 주어진다.
 * 다음 줄에는 N개의 정수 A[1], A[2], ..., A[N]이 주어진다. 
 * 다음 줄에는 M(1<=M<=100,000)이 주어진다. 
 * 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
 * 모든 정수들의 범윈느 int로 한다.
 * 출   력 : M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.  
 *
 */
public class Solution1920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int m = scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			System.out.println(new Solution1920().binarySearch(arr, scan.nextInt()));
		}
	}

	private int binarySearch(int[] arr, int targetNumber) {
		int high = arr.length -1, low = 0, mid = 0;
		
		while (low <= high) {
			mid = (high + low) / 2;
			
			if (arr[mid] == targetNumber) {
				return 1;
			} else if (arr[mid] > targetNumber) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return 0;
	}
}
