package programmers.challenge.level0;

import java.util.Arrays;

/**
 * title: 공백으로 구분하기2
 * date: 2024.11.28
 * author: YUN YOUNG
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181868
 */
public class BlankSpace {
    public static void main(String[] args) {
        BlankSpace sol = new BlankSpace();

        String my_string = " i    love  you";
        String[] result = sol.solution(my_string);

        System.out.println(Arrays.toString(result));
    }

    private String[] solution(String my_string) {
        // \\s+는 공백, 탭 등 모든 공백 문자의 연속을 나타냄
        return my_string.trim().split("\\s+");
    }
}
