package programmers.challenge.level0;

/**
 * title: 간단한 식 계산하기
 * date: 2025.01.19
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181865
 * description: 문자열 binomial 이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고
 * a 와 b 는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
 * 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해주세요.
 */
public class SimpleExpression {
    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

    public static int solution(String binomial) {
        String[] parts = binomial.split(" ");
        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[2]);
        String op = parts[1];

        int result = switch (op) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            default -> throw new IllegalArgumentException("Invalid operator: " + op);
        };

        return result;
    }
}
