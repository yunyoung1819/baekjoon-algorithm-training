package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title: 콜라츠 수열 만들기
 * date: 2025.10.03
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181919
 * 문제설명:
 * 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일때는 3 * x + 1로 바꾸는 계산을
 * 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
 *
 * 그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
 * 게산 결과 1,000보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
 * 임의의 1,000보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해주세요.
 */
public class CollatzSequence {
    public static void main(String[] args) {
        int n = 10;
        int[] result = collatzSequence(n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] collatzSequence(int x) {
        if (x < 1 || x > 1000) {
            throw new IllegalArgumentException("x must be between 1 and 1000");
        }

        List<Integer> seq = new ArrayList<>();
        seq.add(x);

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            seq.add(x);
        }
        return seq.stream().mapToInt(Integer::intValue).toArray();
    }
}
