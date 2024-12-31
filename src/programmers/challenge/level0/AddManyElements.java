package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 배열의 원소만큼 추가하기
 * date: 2024.12.31
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */
public class AddManyElements {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};
        int[] numbers = solution(arr);

        for (int num : numbers) {
            System.out.println(num);
        }
    }

    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
