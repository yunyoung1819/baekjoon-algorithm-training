package programmers.algorithm.string;

import java.util.Scanner;

/**
 * 문제 제목: 7. 회문 문자열
 * 문제 설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *          문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 *          단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 * 입    력: 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * 출    력: 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 * 예시 입력1: gooG
 * 예시 출력1: YES
 *
 * Problem Title: 7. Answering String
 * Problem Description: A string that is the same as a front or back reading is called a round string.
 *                      Once a string is entered, write a program that outputs "YES" if it is a reply string and "NO" if it is not a reply string.
 *                      It is not case sensitive when examining single statements.
 * Input: The first line is given a string with no spaces that do not exceed 100 in length 100.
 * Output: Outputs the result of whether it is a reply string on the first line as YES or NO.
 * Example input 1: gooG
 * Example Output 1: YES
 */
public class ReplyString1 {
	private void solution(String input) {
		String str = input.toLowerCase();
		char[] array = str.toCharArray(); // g o o g
		char[] reverseArray = new char[array.length]; // g o o g
		int cnt = 0;

		for (int i = 0; i < array.length; i++) {
			reverseArray[i] = array[array.length-1-i];
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] == reverseArray[j]) {
				cnt++;
			}
		}
		if (cnt == array.length) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		ReplyString1 replyString1 = new ReplyString1();
		replyString1.solution(input);
		sc.close();
	}
}