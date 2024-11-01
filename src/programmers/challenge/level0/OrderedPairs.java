package programmers.challenge.level0;

import java.util.stream.IntStream;

/**
 * 문제제목: 순서쌍의 개수
 * 작 성 일: 2024.11.01
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120836
 */
public class OrderedPairs {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
