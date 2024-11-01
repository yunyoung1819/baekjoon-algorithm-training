package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제제목: 약수 구하기
 * 작 성 일: 2024.11.01
 * 작 성 자: YUN YOUNG
 * 문제링크: <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120897">...</a>
 */
public class DivisibleNumber {
    public static void main(String[] args) {
        int n = 24; // test case
        solution(n);
    }

    private static void solution(int n) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {   // n을 i로 나누어서 떨어지면 약수
                numbers.add(i);
            }
        }

        int[] answer = new int[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
    }
}
