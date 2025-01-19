package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title: 배열 만들기 3
 * date: 2025.01.19
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181895
 */
public class CreateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        int[] result = solution(arr, intervals);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1]; i++) {
                result.add(arr[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
