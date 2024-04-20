package programmers.algorithm_solving.string;

import java.util.Scanner;

/**
 * 문제 제목: 5. 특정 문자 뒤집기
 * 문제 설명: 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 입    력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출    력: 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력: a#b!GE*T@S
 * 예시 출력: S#T!EG*b@A
 *
 * Problem Title: 5. Flip Specific Characters
 * Problem Description: Given a string consisting of English alphabets and special characters,
 * write a program that turns only the English alphabet upside down,
 * and produces and outputs a string that remains in its place for special characters.
 * Input: The first line is given a string not exceeding 100 in length.
 * Output: Prints a string on the first line with only the alphabet reversed.
 *
 * Example input: a#b!GE*T@S
 * Example output: S#T!EG*b@A
 */
public class FlipSpecificCharacters1 {
	private String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		FlipSpecificCharacters1 F = new FlipSpecificCharacters1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(F.solution(str));
	}
}
