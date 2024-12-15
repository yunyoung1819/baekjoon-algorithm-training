package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 마지막 두 원소
 * date: 2024.12.15
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */
public class Solution181927 {
    public static void main(String[] args) {
        int[] numList = {2, 1, 6};
        int[] result = solution(numList);

        Arrays.stream(result).forEach(num -> System.out.print(num + " "));
    }

    private static int[] solution(int[] num_list) {
        if (num_list == null || num_list.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int len = num_list.length;
        int lastElement = num_list[len - 1];
        int previousElement = num_list[len - 2];

        int[] result = Arrays.copyOf(num_list, len + 1);
        result[result.length - 1] = calculateAdditionalElement(lastElement, previousElement);;
        return result;
    }

    private static int calculateAdditionalElement(int lastElement, int previousElement) {
        return lastElement > previousElement ? lastElement - previousElement : lastElement * 2;
    }
}
