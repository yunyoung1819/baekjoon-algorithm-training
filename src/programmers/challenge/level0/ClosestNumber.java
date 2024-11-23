package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 가까운 수
 * date: 2024.11.24
 * author: yun young
 * link: <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120890">link</a>
 */
public class ClosestNumber {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 2, 1};
        int n1 = 3;
        System.out.println(findClosestNumber(array1, n1));

        int[] array2 = {10, 11, 12};
        int n2 = 13;
        System.out.println(findClosestNumber(array2, n2));
    }

    private static int findClosestNumber(int[] array, int n) {
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int currentDifference = Math.abs(array[i] - n);

            if (minDifference > currentDifference) {
                minDifference = currentDifference;
                closest = array[i];
            }
        }
        return closest;
    }
}
