package programmers.challenge.level0;

import java.util.*;

/**
 * title: 홀수 vs 짝수
 * date: 2024.11.28
 * author: YUN YOUNG
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */
public class OddEven {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] num_list) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < num_list.length; i++) {
            numberMap.put(i + 1, num_list[i]);
        }

        int oddSum = 0;
        int evenSum = 0;

        Iterator<Map.Entry<Integer, Integer>> iterator = numberMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getKey() % 2 == 0) {
                evenSum += entry.getValue();
            } else {
                oddSum += entry.getValue();
            }
        }

        if (oddSum > evenSum) {
            return oddSum;
        } else {
            return evenSum;
        }
    }
}
