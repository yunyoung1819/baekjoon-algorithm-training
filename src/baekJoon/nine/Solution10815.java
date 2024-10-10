package baekJoon.nine;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 : 10815번 
 * 문제제목 : 숫자 카드 
 * 문제링크 : https://www.acmicpc.net/problem/10815
 * 작 성 일 : 2019.07.21
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
 * 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 
 * 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N (1<= N <= 500,000)이가 주어진다.
 * 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 
 * 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
 * 셋째 줄에는 M (1<= M <= 500,000)이 주어진다. 
 * 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야할 M개의 정수가 주어지며, 이 수는
 * 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
 * 
 * 출  력 : 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을,
 * 아니면 0을 공백으로 구분해 출력한다. 
 *
 */
public class Solution10815 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numberCard = new int[n];
		
		for (int i = 0; i < numberCard.length; i++) {
			numberCard[i] = scan.nextInt();
		}
		
		Arrays.sort(numberCard); // 이진 탐색을 위한 오름차순 정렬 
		
		int m = scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			int targetNumber = scan.nextInt();
			System.out.println(new Solution10815().binarySearch(numberCard, targetNumber));
		}
		
		scan.close();
	}

	private int binarySearch(int[] arr, int targetNumber) {
		int high = arr.length -1, low = 0;
		
		while (low <= high) {
		int middle= (high + low) / 2;
			
			if (targetNumber == arr[middle]) {
				return 1;
			} else if (targetNumber > arr[middle]) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		return 0;
	}
}
