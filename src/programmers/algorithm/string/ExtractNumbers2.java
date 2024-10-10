package programmers.algorithm.string;

import java.util.Scanner;

/**
 * 숫자만 추출하기 - 다른 풀이
 */
public class ExtractNumbers2 {
	public int solution(String s) {
		int answer = 0;
		for (char x : s.toCharArray()) {
			if (x >= 48 && x <=57) { // '0'(48) ~ '9'(57)
				answer = answer * 10 + (x - 48); // 48을 빼면 실제 숫자값이 된다
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		ExtractNumbers2 extractNumbers2 = new ExtractNumbers2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(extractNumbers2.solution(str));
	}
}
