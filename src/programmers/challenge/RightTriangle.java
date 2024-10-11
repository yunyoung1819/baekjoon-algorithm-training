package programmers.challenge;

import java.util.Scanner;

/**
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120823
 * 작 성 일: 2024.10.09
 * 작 성 자: YUN YOUNG
 */
public class RightTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
