package programmers.challenge;

/**
 * 문제제목: 피자 나눠 먹기
 * 작 성 일: 2024.09.14
 * 작 성 자: YUN YOUNG
 * 문제설명: 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사R람의 수 n이 주어질 때,
 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 */
public class SharingPizza_Ex1 {
    public static void main(String[] args) {
        // 테스트 케이스 실행
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    private static int solution(int n) {
        // 필요한 피자 수
        int pizzaNeeded;

        // 사람 수를 7로 나눈 몫을 계산
        pizzaNeeded = n / 7;

        // 만약 7조각으로 나누어 떨어지지 않으면 피자를 한 판 더 추가
        if (n % 7 != 0) {
            pizzaNeeded += 1; // 나머지가 있으면 한 판 더 추가
        }
        return pizzaNeeded; // 필요한 피자 판 수 반환
    }
}
