package programmers.problem.solving.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 문제제목: 올바른 괄호
 * 문제설명: 괄호가 입력되면 올바른 괄호이면 "YES", 올바르지 않으면 "NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는거지만 (()()))은 올바른 괄호가 아니다.
 * 
 * 입     력: 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * 출     력: 첫 번째 줄에 YES, NO를 출력한다.
 * 
 * 예시입력 1: (()(()))(()
 * 예시출력1: NO
 */
public class CorrectParentheses {
	private boolean solution(String input) {
		Stack<Character> stack = new Stack<>();
		char[] arr = input.toCharArray();
		for (char c : arr) {
			if (c == '(') {
				stack.push(c);
			}
			if (c == ')') {
				if (stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		CorrectParentheses correctParentheses = new CorrectParentheses();
		boolean answer = correctParentheses.solution(input);
		
		System.out.print(answer == true ? "YES" : "NO");
		sc.close();
	}
}
