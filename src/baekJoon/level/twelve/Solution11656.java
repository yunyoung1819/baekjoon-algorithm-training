package baekJoon.level.twelve;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 : 11656번 
 * 문제제목 : 접미사 배열 
 * 문제링크 : https://www.acmicpc.net/problem/11656
 * 작 성 일 : 2020.04.10
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 * baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, oon, on, n으로 총 8가지가 있고,
 * 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 * 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000보다 작거나 같다.
 * 출   력 : 첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.
 */
public class Solution11656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] strArray = new String[s.length()];
		getSuffixArray(s, strArray);
		Arrays.sort(strArray);
		
		for (String str : strArray) {
			System.out.println(str);
		}
		
		sc.close();
	}

	private static void getSuffixArray(String s, String[] strArray) {
		for (int i = 0; i < s.length() ; i++) {
			strArray[i] = s.substring(i, s.length());
		}
	}
}
