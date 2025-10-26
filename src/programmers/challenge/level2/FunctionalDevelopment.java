package programmers.challenge.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * title: 기능 개발
 * date: 2025.10.25
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * description:
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다.
 * 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 * 또, 각 기능의 개발 속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
 * 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progesses와 각 작업의 개발 속도가 적힌
 * 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 *
 * 입출력 예
 * progresses: [93, 30, 55], speeds: [1,30,5], return [2, 1]
 * progresses: [95, 90, 99, 99, 80, 99], speeds: [1, 1, 1, 1, 1, 1], return: [1, 3, 2]
 *
 */
public class FunctionalDevelopment {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = solution(progresses, speeds);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            q.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int days = 0;
        int count = 0;
        while (!q.isEmpty()) {
            int index = q.poll();
            int expiration = (int) Math.ceil((double) (100 - progresses[index]) / speeds[index]);
            if (expiration > days) {
                if (days != 0) {
                    result.add(count);
                    count = 0;
                }
                days = expiration;
            }
            count++;
        }

        result.add(count);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
