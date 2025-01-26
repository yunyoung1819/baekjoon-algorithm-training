package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: x 사이의 개수
 * date: 2025.01.12
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */
public class CountX {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";
        int[] result = solution(myString);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String myString) {
        String[] parts = myString.split("x", -1); // split 메서드에 두번째 매개변수 -1을 추가하면 결과 배열 끝에 빈 문자열도 포함됨
        int[] lengths = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            lengths[i] = parts[i].length();
        }

        return lengths;
    }
}
