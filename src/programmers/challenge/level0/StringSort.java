package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 문자열 정렬하기 1
 * date: 2024.11.09
 * author: YUN YOUNG
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */
public class StringSort {
    public static void main(String[] args) {
        String my_string = "hi123o92";
        System.out.println(solution(my_string));
    }

    private static int[] solution(String myString) {

        char[] charArray = myString.toCharArray();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                int number = (charArray[i] - 48);
                numbers.add(number);
            }
        }

        return numbers.stream()
                .sorted().mapToInt(Integer::intValue)
                .toArray();
    }
}
