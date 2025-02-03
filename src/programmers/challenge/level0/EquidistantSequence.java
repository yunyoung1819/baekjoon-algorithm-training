package programmers.challenge.level0;

/**
 * title: 등차수열의 특정한 항만 더하기
 * date: 2025.02.03
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181931
 * description: 두 정수 a, d의 길이가 n인 boolean 배열 included가 주어집니다.
 * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1 항을 의미할 때,
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 완성해주세요.
 */
public class EquidistantSequence {
    public static void main(String[] args) {
        boolean[] included1 = {true, false, false, true, true};
        int result1 = solution(3, 4, included1);
        System.out.println(result1);

        boolean[] included2 = {false, false, false, true, false, false, false};
        int result2 = solution(7, 1, included2);
        System.out.println(result2);
    }

    private static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a;
            }
            a += d;
        }

        return answer;
    }
}
