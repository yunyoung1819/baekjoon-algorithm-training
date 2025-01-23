package programmers.challenge.level0;

/**
 * title: 날짜 비교하기
 * date: 2025.01.23
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181838
 */
public class Solution181838 {
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};           // [year, month, day]
        int[] date2 = {2021, 12, 29};
        System.out.println(solution(date1, date2)); // 기댓값 1

        int[] date3 = {1999, 12, 31};
        int[] date4 = {2000, 1, 1};
        System.out.println(solution(date3, date4)); // 기댓값 1

        int[] date5 = {2022, 1, 1};
        int[] date6 = {2021, 12, 31};
        System.out.println(solution(date5, date6)); // 기댓값 0
    }

    private static int solution(int[] date1, int[] date2) {
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        }

        if (date1[1] < date2[1]) {
            return 1;
        } else if (date1[1] > date2[1]) {
            return 0;
        }

        if (date1[2] < date2[2]) {
            return 1;
        } else {
            return 0;
        }
    }
}
