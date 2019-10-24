package baekJoon.level.ten;

import java.util.Scanner;

/**
 * 문제번호 : 2562번 
 * 문제제목 : 최댓값 
 * 문제링크 : https://www.acmicpc.net/problem/2562
 * 작 성 일 : 2019.10.24
 * 작 성 자 : YUN YOUNG
 * 
 * 문제내용 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 * 
 * 입   력 : 첫째 줄부터 아홉번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다.
 * 출   력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 *
 */
public class Solution2562 {
	
	static int[] number = new int[9];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			number[i] = sc.nextInt();
		}
		
		Solution2562 solution = new Solution2562();
		solution.getMaximumValueInArray(number);
		
		sc.close();
	}

	private void getMaximumValueInArray(int[] num) {
		int index = 0;
		int maxValue = 0;
		
		for (int i = 0; i < 9; i++) {
			if (maxValue < num[i]) {
				maxValue = num[i];
				index = i + 1;
			}
		}
		System.out.println(maxValue);
		System.out.println(index);
	}
}
