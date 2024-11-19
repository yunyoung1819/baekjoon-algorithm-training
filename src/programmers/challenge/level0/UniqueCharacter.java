package programmers.challenge.level0;

import java.util.*;

/**
 * 문제제목: 한번만 등장한 문자
 * 작 성 일: 2024.11.19
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120896
 * 문제설명: 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록
 * solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */
public class UniqueCharacter {
    public static void main(String[] args) {
//        String s1 = "abcabcadc";
//        System.out.println(solution(s1));

        String s2 = "hello";
        System.out.println(solution(s2));
    }

    private static String solution(String s) {
        // Map을 사용하여 각 문자의 등장 횟수를 카운트
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // 등장 횟수가 1인 문자만 리스트에 추가
        List<Character> uniqueChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueChars.add(entry.getKey());
            }
        }

        // 사전 순으로 정렬
        Collections.sort(uniqueChars);

        // 결과 문자열 생성
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }
}
