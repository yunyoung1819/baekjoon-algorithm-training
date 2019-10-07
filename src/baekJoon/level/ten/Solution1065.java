package baekJoon.level.ten;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Scanner;

/**
 * 문제번호 : 1065번
 * 문제제목 : 한수
 * 문제링크 : https://www.acmicpc.net/problem/1065
 * 작 성 일 : 2019.10.08
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 출   력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 * 풀   이 : 2자리 수 이하의 모든 값은 한수이다. 3자리 수에서는 두번째 자리수와 첫번째 자리수의 차가
 * 세번째 자리수와 두번째 자리수의 차와 같으면 한수로 정의한다. 
 *
 */
public class Solution1065 {
    public static void main(String[] args) {
    	Solution1065 solution = new Solution1065();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution.getHanNumberCount(n);
        System.out.println(answer);
        
        sc.close();
    }
    
    private int getHanNumberCount(int inputNumber) {
        int count = 0;
        for (int i = inputNumber; i > 0; i--) {
            String inputN = String.valueOf(i);
            // 3자리 수 이하인 경우에는 한수
            if(inputN.length() <= 2) {
                count += 1;
            } else {
                int firstSubtraction = inputN.charAt(1) - inputN.charAt(0);  // 두번째 자리수와 첫번째 자리수의 차
                int secondSubtraction = inputN.charAt(2) - inputN.charAt(1); // 세번째 자리수와 두번째 자리수의 차
                if (firstSubtraction == secondSubtraction) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
