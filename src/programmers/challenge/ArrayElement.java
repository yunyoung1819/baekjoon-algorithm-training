package programmers.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제제목: 배열 원소의 길이
 * 작 성 일: 2024.10.11
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120854
 */
public class ArrayElement {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        solution(strlist);
    }

    private static int[] solution(String[] strlist) {
        List<Integer> answerList = new ArrayList<>();

        for (String s : strlist) {
            char[] charArray = s.toCharArray();
            answerList.add(charArray.length);
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
