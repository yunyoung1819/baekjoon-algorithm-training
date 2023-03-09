package baekJoon.level.thirteen;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 문제번호: 699번
 * 문제제목: 애너그램
 * 문제링크: https://www.acmicpc.net/problem/6996
 * 작 성 자: YUN YOUNG
 * 문제설명: 두 단어 A와 B가 주어졌을 때, A에 속하는 알파벳의 순서를 바꾸어서 B를 만들 수 있다면 A와 B를 애너그램이라고 한다.
 * 두 단어가 애너그램인지 아닌지 구하는 프로그램을 작성하시오.
 * 입   력: 첫째 줄에 테스트 케이스의 개수 (<100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고
 * 길이가 100을 넘지 않는 단어가 공백으로 구분되어서 주어진다. 단어는 알파벳 소문자로만 이루어져 있다.
 * 출력: 각 테스트 케이스마다 애너그램인지 아닌지를 출력한다.
 */
public class Solution6996 {
	private static boolean solve(String first, String second) {
		if (first.length() != second.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : first.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for (char c : second.toCharArray()) {
			if (!map.containsKey(c) || map.get(c) == 0) {
				return false;
			} else {
				map.put(c, map.get(c)-1);
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTests = sc.nextInt();

		for (int i = 0; i < numTests; i++) {
			String first = sc.next().toLowerCase();
			String second = sc.next().toLowerCase();
			System.out.println(first + " & " + second + " are " + (solve(first, second) ? "anagrams." : "NOT anagrams."));
		}
		sc.close();
	}
}
