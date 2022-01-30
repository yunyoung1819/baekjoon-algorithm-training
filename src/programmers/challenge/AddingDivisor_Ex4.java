package programmers.challenge;

/**
 * 문제제목: 약수의 개수와 덕셈
 * 작 성 일: 2022.01.30
 * 작 성 자: YUN YOUNG
 * 문제설명: 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서,
 * 약수의 개수가 짝수인 수는 더하고,
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 <= left <= right <= 1,000
 */
public class AddingDivisor_Ex4 {
    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (getDivisorCount(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    private static int getDivisorCount(int num) {
        int count = 0;
        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        solution(24, 27);
    }
}
