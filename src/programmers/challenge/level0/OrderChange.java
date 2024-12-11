package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 순서 바꾸기
 * date: 2024.12.11
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181891
 */
public class OrderChange {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        int[] mergedArray = changeOrder(num_list, n);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    private static int[] changeOrder(int[] num_list, int n) {
        int[] array1 = Arrays.copyOfRange(num_list, 0, n);         // n 번째까지의 원소들
        int[] array2 = Arrays.copyOfRange(num_list, n, num_list.length); // n 번째 원소 이후의 원소들
        int[] mergedArray = new int[num_list.length];

        int index = 0;
        for (int num : array2) {
            mergedArray[index++] = num;
        }

        for (int num : array1) {
            mergedArray[index++] = num;
        }
        return mergedArray;
    }
}
