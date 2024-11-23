package programmers.challenge.level1;

import java.util.Arrays;

/**
 * title: 뒤에서 5등까지
 * date: 2024.11.24
 * author: yun young
 * link: <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181853">link</a>
 */
public class Number5 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        System.out.println(solution(num_list));
    }

    private static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[5];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
