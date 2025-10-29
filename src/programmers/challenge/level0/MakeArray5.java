package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title: 배열 만들기 5
 * date: 2025.10.30
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181912
 * description: 문자열 배열 intStrs와 정수 k, s, l가 주어집니다.
 * intStrs의 원소는 숫자로 이루어져 있습니다.
 * 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
 * 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해주세요.
 */
public class MakeArray5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int[] result = solution(intStrs, 50000, 5, 5);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numStrs = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String subStr = intStrs[i].substring(s, s + l);
            int intStr = Integer.parseInt(subStr);
            if (intStr > k) {
                numStrs.add(intStr);
            }
        }

        return numStrs.stream().mapToInt(Integer::intValue).toArray();
    }
}
