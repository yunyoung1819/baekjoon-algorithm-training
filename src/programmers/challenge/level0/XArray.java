package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 빈 배열에 추가, 삭제하기
 * date: 2025.01.26
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181860
 * description: 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
 * flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] x 2번 추가하고,
 * flag[i]가 flase라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return하는 solution 함수를 작성해주세요.
 */
public class XArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] result = solution(arr, flag);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int[] arr, boolean[] flag) {
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    numberList.add(arr[i]);
                }
            } else {
                for (int k = 0; k < arr[i]; k++) {
                    numberList.remove(numberList.size() - 1);
                }
            }
        }

        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }
}
