package programmers.algorithm.hash;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * title: 중복된 문자 제거
 * date: 2025.05.03
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120888
 */
public class Solution120888 {
    public static void main(String[] args) {
        String my_string = "people";
        String result = solution(my_string);
        System.out.println(result);
    }

    private static String solution(String my_string) {
        Set<Character> charSet = new LinkedHashSet<>();
        char[] array = my_string.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char c : array) {
            charSet.add(c);
        }
        charSet.stream().forEach(c -> result.append(c));
        return result.toString();
    }
}
