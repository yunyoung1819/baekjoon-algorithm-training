package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title: 배열 만들기 2
 * date: 2025.10.04
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181921
 * description: 정수 l과 r이 주어졌을 때, l이상 r 이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를
 * 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해주세요.
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 */
public class MakeArray2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5, 555)));
        System.out.println(Arrays.toString(createArray(10, 20)));
    }

    private static int[] createArray(int l, int r) {
        List<Integer> filtered = new ArrayList<>();

        while (l <= r) {
            String strNum = String.valueOf(l);
            if (strNum.matches("^[05]+$")) {
                filtered.add(Integer.parseInt(strNum));
            }
            l++;
        }
        return !filtered.isEmpty() ? filtered.stream().mapToInt(Integer::intValue).toArray()
            : new int[]{-1};
    }
}
