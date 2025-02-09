package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 배열의 길이를 2의 거듭제곱으로 만들기
 * date: 2025.02.09
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181857
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int[] arr = {22};
        int[] answer = solution(arr);

        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int[] arr) {
        int length = arr.length;
        int pow = (int) Math.pow(2, 0);
        int power = 1;

        while (length > pow) {
            pow = (int) Math.pow(2, power);
            power++;
        }

        return Arrays.copyOf(arr, pow);
    }
}
