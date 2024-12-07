package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 길이에 따른 연산
 * date: 2024.12.07
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */
public class Calculator {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        Calculator calculator = new Calculator();
        int result = calculator.calculateByLength(num_list);

        System.out.println("Result: " + result);
    }

    private int calculateByLength(int[] numList) {
        int result = 0;
        if (numList.length >= 11) { // 리스트에 있는 모든 원소의 합을 리턴
            for (int number : numList) {
                result += number;
            }
        } else { // 리스트에 있는 모든 원소의 곱을 리턴
            result = 1;
            for (int number : numList) {
                result *= number;
            }
        }

        List<Integer> list = new ArrayList<>();
        list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
