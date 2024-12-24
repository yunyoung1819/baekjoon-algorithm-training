package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 접미사 배열
 * date: 2024.12.24.
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181909
 * description: 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a" 입니다.
 * 문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을
 * return 하는 solution 함수를 작성해 주세요.
 */
public class SuffixArray {
    public static void main(String[] args) {
        String my_string = "programmers";
        String[] arr = solution(my_string);

        for (String a : arr) {
            System.out.print(a + " ");
        }
    }

    private static String[] solution(String my_string) {
        int myStringLength = my_string.length();
        String[] result = new String[myStringLength];

        for (int i = myStringLength - 1; i >= 0; i--) {
            result[i] = my_string.substring(i);
        }

        Arrays.sort(result);

        return result;
    }
}
