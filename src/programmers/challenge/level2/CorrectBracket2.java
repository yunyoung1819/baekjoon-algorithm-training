package programmers.challenge.level2;

/**
 * @문제제목 : 올바른 괄호 
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
public class CorrectBracket2 {
	public static void main(String[] args) {
		CorrectBracket2 correctBracket = new CorrectBracket2();
		System.out.println(correctBracket.solution(new String("()()")));
		System.out.println(correctBracket.solution(new String("(()(")));
	}

	private boolean solution(String s) {
		boolean answer = true;
		String str = s.trim();
		int check = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				check += 1;
			} else {
				check -= 1;
			}
			if (check < 0) {
				return false;
			}
		}
		if (check != 0) {
			return false;
		}	
		return answer;
	}
}
