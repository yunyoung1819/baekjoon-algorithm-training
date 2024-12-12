package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * title: 배열의 원소 삭제하기
 * date: 2024.12.12
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181844
 */
public class ArrayFilter {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        int[] result = solution(arr, delete_list);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        List<Integer> filteredList = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                filteredList.add(num);
            }
        }

        return filteredList.stream().mapToInt(Integer::intValue).toArray();
    }
}
