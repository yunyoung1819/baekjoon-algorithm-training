package programmers.challenge.level2;

import java.util.Stack;

/**
 * title: 괄호 회전하기
 * date: 2025.09.29
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/76502
 * description: 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
 * (), [], {}는 모두 올바른 괄호 문자열입니다.
 * 만약 A가 올바른 괄호 문자열이라면, (A), [A], {A}도 올바른 괄호 문자열입니다. 예를 들어, []가 올바른 괄호 문자열이므로
 * ([])도 올바른 괄호 문자열입니다.
 * 만약 A,B가 올바른 괄호 문자열이라면, AB도 올바른 괄호 문자열입니다. 예를 들어 {}와 ([])가 올바른 괄호 문자열이므로
 * {}([])도 올바른 괄호 문자열입니다.
 *
 * 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 이 s를 왼쪽으로 x(0 <= x < (s의 길이)) 칸만큼
 * 회전시켰을 때 s가 올바른 괄호 문자열이 되게하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
 *
 */
public class ParenthesesRotation {
    public static void main(String[] args) {
        String s = "[](){}";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i) + s.substring(0, i);
            if (isCorrect(s1)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                stack.push(']');
            }
            if (c == '(') {
                stack.push(')');
            }
            if (c == '{') {
                stack.push('}');
            }
            if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
