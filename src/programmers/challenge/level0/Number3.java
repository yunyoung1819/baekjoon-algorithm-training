package programmers.challenge.level0;

/**
 * title: 저주의 숫자 3
 * date: 2025.01.21
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120871
 * description: 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 떄문에 3의 배수와 숫자 3을 사용하지 않습니다.
 * 3x 마을 사람들의 숫자는 다음과 같습니다.
 *
 * -----------------------------------------------------------
 * | 10진법 | 3x 마을에서 쓰는 숫자 | 10진법 | 3x 마을에서 쓰는 숫자 |
 * -----------------------------------------------------------
 * |   1    |          1          |   6    |          8          |
 * |   2    |          2          |   7    |         10          |
 * |   3    |          4          |   8    |         11          |
 * |   4    |          5          |   9    |         14          |
 * |   5    |          7          |  10    |         16          |
 * -----------------------------------------------------------
 *
 * 정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return 하도록 solution 함수를 완성해주세요.
 */
public class Number3 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    private static int solution(int n) {
        int result = 0;
        int count = 0;

        for (int i = 1; count < n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                continue;
            }
            count++;
            result = i;
        }

        return result;
    }
}
