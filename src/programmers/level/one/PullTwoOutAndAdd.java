package programmers.level.one;

import java.util.HashSet;
import java.util.Set;

/**
 * 문제제목 : 두 개 뽑아서 더하기
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
 * 작 성 일 : 2021.05.16
 * 작 성 자 : YUN YOUNG
 *
 * 문제설명 : 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
 * 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항: numbers의 길이는 2 이상 100 이하 입니다.
 * numbers의 모든 수는 0 이상 100 이하 입니다.
 *
 */
public class PullTwoOutAndAdd {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        PullTwoOutAndAdd pullTwoOutAndAdd = new PullTwoOutAndAdd();

        System.out.println(pullTwoOutAndAdd.solution(numbers));
    }

    private int[] solution(int[] numbers) {
        Set<Integer> answerSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }
        return answerSet.stream().mapToInt(i -> i).sorted().toArray();
    }
}
