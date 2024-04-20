package programmers.algorithm_solving.stack;

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
		// Stack 생성
		Stack<Character> stack = new Stack<>();
		char[] arr = input.toCharArray();
		
		for (char c : arr) {
			// 입력값이 여는 괄호인 경우 stack에 push
			if (c == '(') {
				stack.push(c);
			}
			// 입력값이 닫는 괄호인 경우 stack에 pop
			if (c == ')') {
				if (stack.isEmpty()) { // 처음 입력값이 닫는 괄호인 경우 
					return false;
				} else {
					stack.pop();
				}
			}
		}
		// 스택이 비어 있으면 (괄호 짝이 맞으면) true 아니면 false를 리턴
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// 입력값 받기
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		CorrectParentheses correctParentheses = new CorrectParentheses();
		boolean answer = correctParentheses.solution(input);
		
		// YES or NO 출력
		System.out.print(answer == true ? "YES" : "NO");
		sc.close();
	}
}
