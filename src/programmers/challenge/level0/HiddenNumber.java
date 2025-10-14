package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 숨어있는 숫자의 덧셈
 * date: 2025.10.14
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120864
 * description: 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
 * my_string 안의 자연수들의 합을 return 하도록 solution 함수를 완성해주세요.
 */
public class HiddenNumber {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    private static int solution(String my_string) {
        String numbersOnly = my_string.replaceAll("[^0-9]", " ");
        String[] parts = numbersOnly.trim().split(" ");

        int sum = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}