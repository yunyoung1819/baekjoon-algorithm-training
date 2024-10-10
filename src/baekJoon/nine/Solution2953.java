package baekJoon.nine;

import java.util.Scanner;

/**
 * 문제번호: 2953번 
 * 문제제목: 나는 요리사다 
 * 문제링크: https://www.acmicpc.net/problem/2953
 * 작 성 일: 2019.06.03
 * 작 성 자: YUN YOUNG
 * 
 * 문제제목: "나는 요리사다"는 다섯 참가자들이 서로의 요리 실력을 뽐내는 티비 프로이다. 
 * 각 참가자는 자신있는 음식을 하나씩 만들어오고, 서로 다른 사람의 음식을 점수로 평가해준다. 점수는 1점부터 5점까지 있다.
 * 각 참가자가 얻은 점수는 다른 사람이 평가해 준 점수의 합이다. 이 쇼의 우승자는 가장 많은 점수를 얻은 사람이 된다.
 * 각 참가자가 얻은 평가 점수가 주어졌을 때, 우승자와 그의 점수를 구하는 프로그램을 작성하시오.
 * 
 * 입   력: 총 다섯 개 줄에 각 참가자가 얻은 네 개의 평가 점수가 공백으로 구분되어 주어진다.
 * 첫 번째 참가자부터 다섯번째 참가자까지 순서대로 주어진다.
 * 항상 우승자가 유일한 경우만 입력으로 주어진다.
 * 
 * 출   력: 첫째 줄에 우승자의 번호와 그가 얻은 점수를 출력한다. 
 */
public class Solution2953 {
	public static void main(String[] args) {
		Solution2953 solution = new Solution2953();
		solution.go();
	}

	private void go() {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][4];
		int[] participant = new int[5];
		int max = 0, number = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				score[i][j] = sc.nextInt();
				participant[i] += score[i][j];
			}
		}
		
		for (int i = 0; i < participant.length; i++) {
			if (max < participant[i]) {
				max = participant[i];
				number = i + 1;
			}
		}
		
		System.out.printf("%d %d", number, max);
		sc.close();
	}
}
