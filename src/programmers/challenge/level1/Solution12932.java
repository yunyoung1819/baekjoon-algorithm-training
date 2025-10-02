package programmers.challenge.level1;

import java.util.Arrays;

/**
 * title: 자연수 뒤집어 배열로 만들기
 * date: 2025.10.03
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/12932
 * description: 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를 들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * n: 12345
 * return: [5,4,3,2,1]
 */
public class Solution12932 {
    public static void main(String[] args) {
        long n = 12345;
        int[] result = solution(n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        String reverse = new StringBuilder(str).reverse().toString();

        for (int i = 0; i < reverse.length(); i++) {
            answer[i] = reverse.charAt(i) - '0';
        }
        return answer;
    }
}
