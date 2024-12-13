package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 카운트 업
 * date: 2024.12.13
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */
public class Solution181920 {
    public static void main(String[] args) {
        Solution181920 solution = new Solution181920();
        solution.sol(3, 10);
    }

    private int[] sol(int start_num, int end_num) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            numberList.add(i);
        }

        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }
}
