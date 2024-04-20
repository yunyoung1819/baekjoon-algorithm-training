package programmers.algorithm_solving.string;

import java.util.Scanner;

/**
 * 유효한 팰린드롬 문제 다른 풀이
 */
public class Palindrome2 {
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if (s.equals(tmp)) {
			answer = "YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		Palindrome2 T = new Palindrome2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
