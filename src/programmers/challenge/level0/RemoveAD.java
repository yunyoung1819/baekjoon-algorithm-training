package programmers.challenge.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Title: ad 제거하기
 * Date: 2025.01.12
 * Author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */
public class RemoveAD {
    public static void main(String[] args) {
        String[] strArr = {"and", "notad", "abcd", "ad1", "ad2"};
        String[] result = solution(strArr);

        for (String str : result) {
            System.out.println(str);
        }
    }

    private static String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(str -> !str.contains("ad"))
                .toArray(String[]::new);
    }
}
