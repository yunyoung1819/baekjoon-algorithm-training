package programmers.challenge.level0;

/**
 * 문제제목: 세균 증식
 * 작 성 일: 2024.09.14
 * 작 성 자: YUN YOUNG
 * 문제설명: 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가
 * 매개변수로 주어질 때 t 시간 후 세균의 수를 return 하도록 하는 solution 함수를 완성해주세요.
 */
public class BacteriaGrowth {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }

    private static int solution(int n, int t) {
        // t 시간만큼 n * 2가 된다.
        for (int i = 0; i < t; i++) {
            n = n * 2;
        }
        return n;
    }
}
