package programmers;

/**
 * 문제: 두 개의 숫자 a와 b가 주어지면, 두 숫자의 최대 공약수를 구해보세요.
 * 제약조건 0 <= a, b <= 20
 *
 */
public class GcdCalculator {

    public int solution(int a, int b) {
        // 만약 둘 중 하나가 0이면 다른 수가 최대 공약수
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        // 두 수 중 더 작은 값을 찾는다
        int limit = Math.min(a, b);

        // limit부터 1까지 하나씩 내려오며 공약수인지 확인
        for (int i = limit; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        // 1은 무조건 공약수이기 때문에 여기까지 내려올 일은 없지만 안전하게 1 반환
        return 1;
    }
}
