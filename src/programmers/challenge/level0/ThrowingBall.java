package programmers.challenge.level0;

/**
 * title: 공 던지기
 * date: 2024.12.06
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120843
 * description: 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그 다음 사람에게만 던질 수 있습니다.
 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는
 * 무엇인지 return 하도록 solution 함수를 완성해보세요.
 */
public class ThrowingBall {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4};
        int k1 = 2;
        System.out.println(solution(numbers1, k1));

        int[] numbers2 = {1,2,3,4,5,6};
        int k2 = 5;
        System.out.println(solution(numbers2, k2));

        int[] numbers3 = {1,2,3};
        int k3 = 3;
        System.out.println(solution(numbers3, k3));
    }

    private static int solution(int[] numbers, int k) {
        int idx = 0;  // 시작하는 사람의 인덱스

        // 공을 k번 던진다
        for (int i = 1; i < k; i++) {
            idx += 2;  // 공을 오른쪽으로 2명씩 건너뛴다
            if (idx >= numbers.length) {
                idx -= numbers.length;
            }
        }

        return numbers[idx];
    }
}
