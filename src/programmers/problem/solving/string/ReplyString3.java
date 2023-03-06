package programmers.problem.solving.string;

import java.util.Scanner;

/**
 * 7번 문제의 다른 풀이 (StringBuilder 사용)
 */
public class ReplyString3 {
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(tmp)) {
			answer = "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		ReplyString3 replyString3 = new ReplyString3();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(replyString3.solution(str));
	}
}
