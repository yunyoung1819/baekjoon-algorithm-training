package baekJoon.eleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 문제번호 : 2750번
 * 문제제목 : 수 정렬하기
 * 문제링크 : https://www.acmicpc.net/problem/2750
 * 작 성 일 : 2020.01.17
 * 작 성 자 : YUN YOUNG
 * 
 * 문제내용 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입      력 : 첫째 줄에 수의 개수 N(1<=N<=1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
 * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출      력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 */
public class Solution2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			numberList.add(number);
		}
		
		toSortNumbers(numberList);
		
		for (int number : numberList) {
			System.out.println(number);
		}
		sc.close();
	}

	private static ArrayList<Integer> toSortNumbers(ArrayList<Integer> numberList) {
		Collections.sort(numberList);
		return numberList;
	}
}
