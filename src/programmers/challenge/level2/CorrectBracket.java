package programmers.challenge.level2;

import java.util.Stack;

/**
 * @문제제목 : 올바른 괄호 (시간 초과 발생) 
 * @문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12909
 * @date : 2019.06.07
 * @author yunyoung
 * 
 * @문제설명: 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.
 * 예를 들어 
 * "()()"또는 "(())()" 는 올바른 괄호 입니다.
 * ")()(" 또는 "(()("는 올바르지 않은 괄호 입니다.
 * 
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고,
 * 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해주세요.
 * 
 * @제한사항
 * 문자열 s의 길이: 100,000 이하의 자연수 
 * 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 *
 */
public class CorrectBracket {
	public static void main(String[] args) {
		CorrectBracket correctBracket = new CorrectBracket();
		System.out.println(correctBracket.solution(new String("()()")));
		System.out.println(correctBracket.solution(new String("(()(")));
	}

	private boolean solution(String s) {
		Stack<Character> st = new Stack<Character>();
		String str = s.trim();
		boolean answer = true;
		boolean initEmpty = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {	// '('가 나올 때만 stack에 push를 한다.
				st.push(str.charAt(i));
				initEmpty = false;		// 최초에 스택이 비어있는지 확인하는 변수 
			} else if (str.charAt(i) == ')') {	// ')'를 다시 만나면 stack에서 pop을 한다.
				if (st.empty()) {
					answer = false;
				} else {
					st.pop();
				}
			}
		}
		if (initEmpty) {
			answer = false;
		} else if (!st.empty()) {
			answer = false;
		} else if (st.empty()) {
			answer = true;
		}
		return answer;
	}
}
