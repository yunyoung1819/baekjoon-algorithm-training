package programmers.challenge.level1;

/**
 * title: 나머지가 1이 되는 수 찾기
 * date: 2024.12.25.
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class FindRemainder {
    public static void main(String[] args) {
        int n1 = 10;
        System.out.println(solution(n1));

        int n2 = 12;
        System.out.println(solution(n2));
    }

    private static int solution(int n) {
        for (int x = 1; x <= n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return -1;
    }

}
