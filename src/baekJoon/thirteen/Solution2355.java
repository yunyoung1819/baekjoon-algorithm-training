package baekJoon.thirteen;

import java.util.Scanner;

/**
 * 문제번호 : 2355번
 * 문제제목 : 시그마
 * 문제링크 : https://www.acmicpc.net/problem/2355
 * 작 성 일 : 2020.06.20
 * 작 성 자 : YUN YOUNG
 *
 * 문제내용 : 두 정수 A와 B가 주어졌을 때, 두 정수 사이에 있는 수의 합을 구하는 프로그램을 작성하시오.
 * 사이에 있는 수들은 A와 B도 포함된다.
 * 입   력 : 첫째 줄에 두 정수 A, B가 주어진다. (-2,147,483,648 ≤ A, B ≤ 2,147,483,647)
 * 출   력 : 첫째 줄에 답을 출력한다. (-2,147,483,648 ≤ 답 ≤ 2,147,483,647)
 */
public class Solution2355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        Solution2355 solution = new Solution2355();
        System.out.println(solution.getSigma(a,b));

        sc.close();
    }

    private long getSigma(long a, long b) {
        long sum = 0;

        if (a <= b) {
            sum = ((a + b) * (b - a + 1) / 2);
        } else {
            sum = ((a + b) * (a - b + 1) / 2);
        }

        return sum;
    }
}
