package baekJoon.thirteen;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 : 1427번 
 * 문제제목 : 소트인사이드 
 * 문제링크 : https://www.acmicpc.net/problem/1427
 * 작 성 일 : 2020.04.20
 * 작 성 자 : YUN YOUNG
 * 문제내용 :  배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 입   력 : 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 출   력 : 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 *
 */
public class Solution1427 {
	private void sortingArrayDesc() {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		int size = number.length();
		char[] digit = new char[size];
		
		for (int i = 0; i < size; i++) {
			digit[i] = number.charAt(i);
		}
		
		Arrays.sort(digit);
		
		for (int i = digit.length - 1; i >= 0; i--) {
			System.out.print(digit[i]);
		}
		sc.close();
	}
	
	// 아래는 테스트로 출력해보기 위한 코드입니다.
	public static void main(String[] args) {
		Solution1427 solution = new Solution1427();
		solution.sortingArrayDesc();
	}
}
