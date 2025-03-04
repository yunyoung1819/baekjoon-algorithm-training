package baekJoon.eleven;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 문제번호 : 2309번
 * 문제제목 : 일곱 난쟁이 
 * 문제링크 : https://www.acmicpc.net/problem/2309
 * 알고리즘 분류 : 브루트 포스 
 * 작 성 일 : 2020.01.28
 * 작 성 자 : YUN YOUNG
 * 
 * 문제내용 : 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 * 아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는,
 * 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다. 
 * 아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 * 
 * 입   력 : 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
 * 
 * 출   력 : 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다. 
 */
public class Solution2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dwarfs = new int[9];
		boolean[] answer = new boolean[9];
		int sum = 0;
		int n = 9;
		
		for (int i = 0; i < n; i++) {
			dwarfs[i] = sc.nextInt();
			sum += dwarfs[i];
		}
		
		for (int i = 0; i < n; i++) {
			boolean search = false;
			for (int j = i + 1; j < n; j++) {
				if (sum - dwarfs[i] - dwarfs[j] == 100) {
					answer[i] = true;
					answer[j] = true;
					search = true;
					break;
				}
			}
			if (search) break;
		}
		
		for (int i = 0; i < n; i++) {
			if (answer[i]) {
				dwarfs[i] = 100;
			}
		}
		Arrays.sort(dwarfs);
		
		for (int i = 0; i < n - 2; i++) {
			System.out.println(dwarfs[i]);
		}
		
		sc.close();
	}
}
