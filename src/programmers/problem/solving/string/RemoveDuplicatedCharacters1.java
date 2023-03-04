package programmers.problem.solving.string;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 문제 제목: 중복 문자 제거
 * 문제 설명: 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *          중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * 입    력: 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 * 출    력: 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * 예시 입력1: ksekkset
 * 예시 출력1: kset
 *
 * Problem Title: Remove Duplicate Characters
 * Problem Description: If a single lowercase string is entered, write a program that removes duplicate characters and outputs them.
 *                      Each character in a deduplicated string retains the order of the original string.
 * Enter: A string is entered on the first line. The length of the string does not exceed 100.
 * Output: Outputs a string with the first line removed from duplicate characters.
 * Example input 1: ksekkset
 * Example output 1: kset
 */
public class RemoveDuplicatedCharacters1 {
	private void solution(String input) {
		StringBuilder answer = new StringBuilder();
		char[] chars = input.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char c : chars) {
			set.add(c);
		}
		for (Character c : set) {
			answer.append(c);
		}
		System.out.println(answer);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		RemoveDuplicatedCharacters1 removeDuplicatedCharacters1 = new RemoveDuplicatedCharacters1();
		removeDuplicatedCharacters1.solution(input);
		sc.close();
	}
}
