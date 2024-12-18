package programmers.challenge.level0;

import java.util.stream.IntStream;

/**
 * title: 배열의 길이에 따라 다른 연산하기
 * date: 2024.12.18
 * author: yun young
 * linK: https://school.programmers.co.kr/learn/courses/30/lessons/181854
 */
public class Solution181854 {
    public static void main(String[] args) {
        Solution181854 solution = new Solution181854();
        int[] arr = {444, 555, 666, 777};
        int n = 100;
        int[] numbers = solution.solve(arr, n);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    private int[] solve(int[] arr, int n) {
        int length = arr.length;

        if (length % 2 == 0) {
            IntStream.range(0, length).filter(i -> i % 2 != 0).forEach(i -> arr[i] += n);
        } else {
            IntStream.range(0, length).filter(i -> i % 2 == 0).forEach(i -> arr[i] += n);
        }
        return arr;
    }
}
