package programmers.challenge.level0;

/**
 * title: 특별한 이차원 배열 2
 * date: 2025.01.11
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181831
 * description: n x n 크기의 이차원 배열 arr이 매개변수로 주어질 때, arr이 당므을 만족하면 1을 아니라면 0을 return하는
 * solution 함수를 작성해주세요.
 * 0 <= i, j < n인 정수 i,j에 대하여 arr[i][j] = arr[j][1]
 */
public class TwoDimensionalArray2 {
    public static void main(String[] args) {
        int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        System.out.println(solution(arr1));

        int[][] arr2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
        System.out.println(solution(arr2));
    }

    private static int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
