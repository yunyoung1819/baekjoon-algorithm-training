package programmers.challenge.level0;

import java.util.*;

/**
 * title: 2의 영역
 * date: 2025.02.14
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181894
 */
public class Solution181894 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        List<Integer> idxList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 2) {
               idxList.add(i);
           }
        }

        if (idxList.isEmpty()) {
            return new int[] {-1};
        }

        int start = idxList.get(0);
        int end = idxList.get(idxList.size() - 1);

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
