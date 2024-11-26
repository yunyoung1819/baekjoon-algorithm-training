package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 배열 비교하기
 * date: 2024.11.27
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181856
 */
public class ArrayComparison {
    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        System.out.println(compareArray(arr1, arr2));

        int[] arr3 = {100, 17, 84, 1};
        int[] arr4 = {55, 12, 65, 26};
        System.out.println(compareArray(arr3, arr4));

        int[] arr5 = {1, 2, 3, 4, 5};
        int[] arr6 = {3, 3, 3, 3, 3};
        System.out.println(compareArray(arr5, arr6));
    }

    private static int compareArray(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            return (sum1 < sum2) ? -1 : ((sum1 == sum2) ? 0 : 1);
        } else {
            return arr1.length < arr2.length ? -1 : 1;
        }
    }
}
