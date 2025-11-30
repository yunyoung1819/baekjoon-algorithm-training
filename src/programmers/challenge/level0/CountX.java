package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title: x 사이의 개수
 * date: 2025.11.30
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181867
 * description: 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때
 * 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return하는 solution 함수를 완성해주세요.
 */
public class CountX {
    public static void main(String[] args) {
        String myString1 = "oxooxoxxox";
        System.out.println(Arrays.toString(solution(myString1)));

        String myString2 = "xabcxdefxghi";
        System.out.println(Arrays.toString(solution(myString2)));
    }

    public static int[] solution(String myString) {
        List<Integer> lengths = new ArrayList<>();
        String[] parts = myString.split("x", -1);

        for (String part : parts) {
            lengths.add(part.length());
        }

        return lengths.stream().mapToInt(Integer::intValue).toArray();
    }
}
