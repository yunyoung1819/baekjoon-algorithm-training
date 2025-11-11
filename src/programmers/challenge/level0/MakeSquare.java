package programmers.challenge.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * title: 정사각형으로 만들기
 * date: 2025.11.11
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181830
 * description: 이차원 정수 배열 arr이 매개변수로 주어집니다.
 * arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
 * 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을
 * return하는 solution 함수를 작성해주세요.
 */
public class MakeSquare {
    public static void main(String[] args) {
        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] answer1 = solution(arr1);
        for (int[] row : answer1) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("----------------------");
        int[][] arr2 = {{57,192,534,2}, {9, 345, 192, 999}};
        int[][] answer2 = solution(arr2);
        for (int[] row : answer2) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("----------------------");
        int[][] arr3 = {{1,2}, {3,4}};
        int[][] answer3 = solution(arr3);
        for (int[] row : answer3) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static int[][] solution(int[][] arr) {
        int row = arr.length;
        int cols = arr[0].length;
        int max = Math.max(row, cols);
        int[][] result = new int[max][max];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
}
