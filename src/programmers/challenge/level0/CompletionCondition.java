package programmers.challenge.level0;

import java.util.Arrays;

/**
 * Title: 삼각형의 완성 조건
 * Date: 2024.11.09
 * Author: YUN YOUNG
 * Link: https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */
public class CompletionCondition {
    public static void main(String[] args) {
        int[] sides = {3,6,2};
        System.out.println(solution(sides));
    }

    private static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < (sides[0] + sides[1]) ? 1 : 2;
    }
}
