package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: A로 B만들기
 * date: 2024.11.23
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120886
 */
public class AtoB_2 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
    }

    private static int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 : 0;
    }
}
