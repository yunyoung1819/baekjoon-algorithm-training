package programmers.challenge.level0;

/**
 * 문제제목: 제곱수 판별하기
 * 작 성 일: 2024.11.08
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */
public class SquareNumber {
    public static void main(String[] args) {
        int n = 144;
        System.out.println(solution(n));
    }

    private static int solution(int n) {

        int sqrt = (int) Math.sqrt(n);

        int  square = sqrt * sqrt;

        if (n == square) {
            return 1;
        }
        return 2;
    }
}
