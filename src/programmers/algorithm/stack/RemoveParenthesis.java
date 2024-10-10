package programmers.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;


/**
 * 문제 제목: 괄호 문자 제거
 * 문제 설명: 입력된 문자열에서 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * 입    력: 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 출    력: 남은 문자만 출력한다.
 *
 * 예시 입력1: (A(BC)D)EF(G(H)(IJ)K)LM(N)
 * 예시 출력1: EFLM
 */
public class RemoveParenthesis {
	private static String solution(String input) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char c : input.toCharArray()) {
			if (c == ')') {
				while (stack.pop() != '(');
			} else {
				stack.push(c);
			}
		}

		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.print(solution(input));
		sc.close();
	}
}
