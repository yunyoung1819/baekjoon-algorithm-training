package programmers.algorithm_solving.string;

import java.util.Scanner;

/**
 * 7번 문제의 다른 풀이
 */
public class ReplyString2 {
	public String solution(String str) {
		// 풀이 코드
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for (int i = 0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt(len-i-1)) {
				return "NO";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		ReplyString2 replyString2 = new ReplyString2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(replyString2.solution(str));
	}
}
