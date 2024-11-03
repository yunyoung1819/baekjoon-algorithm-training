package programmers.challenge.level0;

/**
 * 문제제목: 2차원 배열 만들기
 * 작 성 일: 2024.11.02
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120842
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5,6,7,8};
        int n = 2;
        solution(num_list, n);
    }

    private static int[][] solution(int[] num_list, int n) {
        int length = num_list.length / n;
        int[][] result = new int[length][n];
        int cnt = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[cnt];
                cnt++;
            }
        }
        return result;
    }
}
