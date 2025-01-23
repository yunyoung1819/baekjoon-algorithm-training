package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 문자열 잘라서 정렬하기
 * date: 2025.01.23
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181866
 */
public class Solution181866 {
    public static void main(String[] args) {
        String myString = "dxccxbbbxaaaa";
        solution(myString);
    }

    private static String[] solution(String myString) {
        String[] parts = myString.split("x");
        String[] myStringArr = Arrays.stream(parts)
                .filter(s -> !s.isBlank()).toArray(String[]::new);

        Arrays.sort(myStringArr);

        return myStringArr;
    }
}
