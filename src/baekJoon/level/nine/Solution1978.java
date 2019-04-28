package baekJoon.level.nine;

import java.util.Scanner;

/**
 * 문제번호 : 1978번
 * 문제제목 : 소수 찾기 
 * 문제링크 : https://www.acmicpc.net/problem/1978
 * 작 성 일 : 2019.04.28
 * 작 성 자 : yun young
 * 문제내용 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 입   력 : 첫 줄에 수의 개수 N이 주어진다. N은 100 이하이다. 
 * 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 출   력 : 주어진 수들 중 소수의 개수를 출력한다. 
 * 
 * * 소 수 : 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수.
 *
 */
public class Solution1978 {
	public static void main(String[] args) {
		Solution1978 solution = new Solution1978();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 수의 개수 N
		int sosuCount = 0;
		boolean flag; 
		
		for (int i = 0; i < n; i++) {
			int inputNum = sc.nextInt();
			flag = true;
			
			for (int j = 2; j < inputNum; j++) {	// 1은 소수도 합성수도 아니므로 2부터 시작 
				if (inputNum%j == 0) {	// 소수 X
					flag = false;
					break;
				}
			}
			
			if (flag && inputNum > 1) {
				sosuCount++;
			}
		}
		System.out.println(sosuCount);
		sc.close();		
	}
}
