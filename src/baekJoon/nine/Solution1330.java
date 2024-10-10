package baekJoon.nine;

import java.util.Scanner;

/**
 * 문제번호 : 1330번 
 * 문제제목 : 두 수 비교하기 
 * 문제링크 : https://www.acmicpc.net/problem/1330
 * 작 성 일 : 2019.08.03
 * 작 성 자 : yun young 
 * 문제내용 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 출   력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * 
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다. 
 * A와 B가 같은 경우에는 '=='를 출력한다.  
 *
 */
public class Solution1330 {
	public static void main(String[] args) {
		Solution1330 solution = new Solution1330();
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		solution.compareNumber(a, b);
	}

	private void compareNumber(int a, int b) {
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
