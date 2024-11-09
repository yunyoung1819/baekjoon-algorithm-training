package programmers.challenge.level1;


import java.util.LinkedList;
import java.util.Queue;

/**
 * title: 같은 숫자는 싫어
 * date: 2024.11.09
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class SameNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int preValue = Integer.MAX_VALUE;

        for (int i : arr) {
            if (preValue != i) {
                queue.add(i);
            }
            preValue = i;
        }

        int[] answer = new int[queue.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = queue.poll();
        }

        return answer;
    }
}
