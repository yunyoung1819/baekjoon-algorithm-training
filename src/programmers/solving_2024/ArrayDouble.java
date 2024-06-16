package programmers.solving_2024;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */
public class ArrayDouble {
    public static final int MULTIPLE = 2;

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        solution(numbers);
    }

    private static int[] solution(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();
        for (int number: numbers) {
            numberList.add(number);
        }

        return numberList.stream()
            .mapToInt(i -> i * MULTIPLE)
            .toArray();
    }
}
