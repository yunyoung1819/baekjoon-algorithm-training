package programmers.challenge.level0;

/**
 * title: 가까운 1찾기
 * date: 2025.01.09
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181898
 */
public class NearestOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0};
        int idx = 3;
        int answer = solution(arr, idx);
        System.out.println(answer);
    }

    private static int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
