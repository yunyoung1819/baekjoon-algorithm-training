package programmers.algorithm.string;

import java.util.Arrays;

/**
 * title: 자연수 뒤집어 배열로 만들기
 * date: 2025.04.22
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Problem12932 {
    public static void main(String[] args) {
        Problem12932 problem = new Problem12932();
        long n = 12345;

        int[] answer = problem.solution(n);
        System.out.println(Arrays.toString(answer));
    }

    private int[] solution(long n) {
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();

        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }
}
