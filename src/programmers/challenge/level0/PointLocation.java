package programmers.challenge.level0;

/**
 * 문제제목: 점의 위치 구하기
 * 작 성 일: 2024.10.06
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120841?language=java
 */
public class PointLocation {
    public static void main(String[] args) {
        // 테스트 케이스 실행
        int[] dot1 = {2, 4};
        int[] dot2 = {-7, 9};

        System.out.println(solution(dot1));
        System.out.println(solution(dot2));
    }

    private static int solution(int[] dot) {
        if (dot.length != 2) {
            throw new IllegalArgumentException();
        }

        int x = dot[0];
        int y = dot[1];
        int answer = 0;

        if (x > 0 && y > 0) {
            answer = 1;
        }
        if (x < 0 && y > 0) {
            answer = 2;
        }
        if (x < 0 && y < 0) {
            answer = 3;
        }
        if (x > 0 && y < 0) {
            answer = 4;
        }

        return answer;
    }
}
