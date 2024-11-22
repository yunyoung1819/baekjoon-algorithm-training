package programmers.challenge.level0;

import java.util.HashMap;

/**
 * title: A로 B만들기
 * date: 2024.11.23
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */
public class AtoB {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
    }

    private static int solution(String before, String after) {
        HashMap<Character, Integer> beforeMap = new HashMap<>();
        HashMap<Character, Integer> afterMap = new HashMap<>();

        for (char ch : before.toCharArray()) {
            beforeMap.put(ch, beforeMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : after.toCharArray()) {
            afterMap.put(ch, afterMap.getOrDefault(ch, 0) + 1);
        }

        // 두 HashMap 객체를 비교한다.
        // HashMap은 내부적으로 키-값 쌍을 비교하므로 두 문자열의 빈도가 동일하면 true를 반환한다.
        if (beforeMap.equals(afterMap)) {
            return 1;
        }
        return 0;
    }
}
