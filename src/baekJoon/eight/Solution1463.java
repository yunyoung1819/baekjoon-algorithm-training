package baekJoon.eight;

import java.util.Scanner;

/**
 * 문제번호 : 1463번
 * 문제제목 : 1로 만들기 
 * 작 성 일 : 2019.04.13
 * 작 성 자 : yun young
 * 문제내용 : 	정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지이다.
 * 
 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
 * 3. 1을 뺀다.
 *
 * 정수 N이 주어졌을 때, 위와 같은 연산 세개를 적절히 사용해서 1을 만들려고 한다.
 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 
 * 입   력 : 첫째 줄에 1보다 크거나 같고 10^6보다 작거나 같은 정수 N이 주어진다.
 * 출   력 : 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다. 
 */
public class Solution1463 {
	public static int[] d;
	public static int go(int n) {
		
		if (n == 1) {
			return 0;
		}
		if (d[n] > 0) {
			return d[n];
		}
		d[n] = go(n-1) + 1;
		if (n%2 == 0) {
			int temp = go(n/2) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		if (n%3 == 0) {
			int temp = go(n/3) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		return d[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n+1];
		System.out.println(go(n));
	}
}
