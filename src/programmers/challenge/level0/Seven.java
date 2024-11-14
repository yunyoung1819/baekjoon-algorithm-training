package programmers.challenge.level0;

import java.awt.print.Pageable;

/**
 * title: 7의 개수
 * date: 2024.11.14
 * author: yun young
 * link: <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120912">link</a>
 */
public class Seven {
    public static void main(String[] args) {
        int[] array1 = {7, 77, 17};
        System.out.println(solution(array1));

        int[] array2 = {10, 29};
        System.out.println(solution(array2));
    }

    private static int solution(int[] array) {
        int count = 0;

        for (int number : array) {
            while (number != 0) {
                if (number % 10 == 7) {
                    count++;
                }
                number /= 10;
            }
        }
        return count;
    }
}
