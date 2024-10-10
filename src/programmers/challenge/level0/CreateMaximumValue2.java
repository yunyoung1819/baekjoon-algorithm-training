package programmers.challenge.level0;

import java.util.Arrays;

/**
 * 문제제목: 최댓값 만들기 (2)
 * 작 성 일: 2024.10.11
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120862
 */
public class CreateMaximumValue2 {
    public static void main(String[] args) {
        // Test Value
        int[] arr1 = {1, 2, -3, 4, -5};
        int[] arr2 = {0, -31, 24, 10, 1, 9};
        int[] arr3 = {10, 20, 30, 5, 5, 20, 5};
        int[] arr4 = {-1, 2};

        // Test Case 실행
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
        System.out.println(solution(arr4));
    }

    private static int solution(int[] numbers) {

        int answer = 0;

        if (numbers.length <= 2) {
            return numbers[0] * numbers[1];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int multipliedNumber = numbers[i] * numbers[j];
                answer = Math.max(answer, multipliedNumber);
            }
        }
        return answer;
    }
}
