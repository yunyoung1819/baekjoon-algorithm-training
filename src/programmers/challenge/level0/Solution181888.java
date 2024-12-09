package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.List;

/**
 * title: n개 간격의 원소들
 * date: 2024.12.09
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181888
 * description: 정수 리스트 num_list 와 정수 n이 주어질 때, num_list의 첫번째 원소부터 마지막 원소까지
 * n개 간격으로 저장되어 있는 원소들을 차례로 담은 리스트를 return 하도록 solution 함수를 완성해주세요.
 */
public class Solution181888 {
    public static void main(String[] args) {

        Solution181888 sol = new Solution181888();
        int[] num_list = {4, 2, 6, 1, 7, 6};

        sol.solution(num_list, 2);
    }

    private int[] solution(int[] num_list, int n) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            numbers.add(num_list[i]);
        }
        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
