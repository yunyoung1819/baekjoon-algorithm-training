package programmers.challenge;

import java.util.Arrays;

/**
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120847
 * 작 성 일: 2024.10.09
 * 작 성 자: YUN YOUNG
 */
public class CreateMaximumValue {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {0,31,24,10,1,9};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }

    private static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int num1 = numbers[numbers.length-1];
        int num2 = numbers[numbers.length-2];
        return num1 * num2;
    }
}
