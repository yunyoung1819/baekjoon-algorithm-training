package programmers.challenge.level0;

import java.util.Arrays;

/**
 * 문제제목: 배열 자르기
 * 작 성 일: 2024.10.12
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */
public class ArrayCut {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;

        int[] answers = solution(arr, num1, num2);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
