package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: n번째 원소까지
 * date: 2024.12.10
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */
public class NthElement {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        NthElement element = new NthElement();
        int[] nthElement = element.getNthElement(num_list, n);
        for (int e : nthElement) {
            System.out.println(e);
        }
    }

    private int[] getNthElement(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
