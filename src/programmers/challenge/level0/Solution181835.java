package programmers.challenge.level0;

/**
 * title: 조건에 맞게 수열 변환하기 3
 * date: 2024.12.22.
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181835
 */
public class Solution181835 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        int[] elements = solution(arr, k);
        for (int element : elements) {
            System.out.print(element + " ");
        }
    }

    private static int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        }
        return arr;
    }
}
