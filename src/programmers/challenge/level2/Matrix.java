package programmers.challenge.level2;


/**
 * title: 행렬의 곱셉
 * author: yun young
 * date: 2025.04.20
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/12949
 * description: 2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};

        int[][] answer = solution(arr1, arr2);
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return arr;
    }
}
