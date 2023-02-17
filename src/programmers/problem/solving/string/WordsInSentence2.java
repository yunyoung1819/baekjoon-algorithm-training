package programmers.problem.solving.string;

import java.util.Scanner;

/**
 * 3. 문장 속 단어 문제 다른 풀이
 */
public class WordsInSentence2 {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		if (str.length() > m) {
			answer = str;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		WordsInSentence2 T = new WordsInSentence2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
