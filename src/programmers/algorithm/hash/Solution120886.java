package programmers.algorithm.hash;

import java.util.Arrays;

/**
 * title: A로 B만들기
 * date: 2025.05.05
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */
public class Solution120886 {
    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";
        System.out.println(solution(before, after));
    }

    private static int solution(String before, String after) {
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isSame = Arrays.equals(arr1, arr2);
        return isSame ? 1 : 0;
    }
}
