package programmers.challenge.level2;

import java.util.Stack;

/**
 * title: 올바른 괄호
 * date: 2025.09.29
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/12909
 * description: 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
 * "()()" 또는 (())()"는 올바른 괄호입니다.
 * ")()(" 또는 "(()("는 올바르지 않은 괄호입니다.
 * '(' 또는 ')'로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를
 * return 하는 solution 함수를 완성해주세요.
 */
public class CorrectParentheses {
    public static void main(String[] args) {
        String s1= "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4= "(()(";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));
    }

    private static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
