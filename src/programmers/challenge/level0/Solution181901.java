package programmers.challenge.level0;

import java.util.*;

/**
 * title: 배열 만들기1
 * date: 2024.12.16
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181901
 */
public class Solution181901 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        Solution181901 solution = new Solution181901();
        int[] answer = solution.solve(n, k);

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    private int[] solve(int n, int k) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                numbers.add(i);
            }
        }

        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
