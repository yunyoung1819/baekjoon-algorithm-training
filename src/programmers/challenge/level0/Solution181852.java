package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title: 뒤에서 5등 위로
 * date: 2025.01.09
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181852
 */
public class Solution181852 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = solution(num_list);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int[] num_list) {
        List<Integer> numberList = new ArrayList<Integer>();
        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++) {
            numberList.add(num_list[i]);
        }

        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }
}
