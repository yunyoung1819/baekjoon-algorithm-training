package programmers.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */
public class MultipleN {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        solution(n, numlist);
    }

    public static int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            answer.add(numlist[i]);
        }

        return answer.stream()
            .filter(i -> i % n == 0)
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
