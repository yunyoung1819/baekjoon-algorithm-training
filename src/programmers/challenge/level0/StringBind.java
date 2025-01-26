package programmers.challenge.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * title: 문자열 묶기
 * date: 2025.01.26
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181855
 */
public class StringBind {
    public static void main(String[] args) {
        String[] strArr = {"a", "bc", "d", "efg", "hi"};
        System.out.println(solution(strArr));
    }

    private static int solution(String[] strArr) {
        Map<Integer, Integer> counterMap = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            counterMap.put(length, counterMap.getOrDefault(length, 0) + 1);
        }

        int maxSize = 0;
        for (int count : counterMap.values()) {
            maxSize = Math.max(maxSize, count);
        }

        return maxSize;
    }
}
