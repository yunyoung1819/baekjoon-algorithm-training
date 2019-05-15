package baekJoon.level.nine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 문제번호 : 3460번 
 * 문제제목 : 이진수
 * 문제링크 : https://www.acmicpc.net/problem/3460
 * 작 성 일 : 2019.05.15
 * 작 성 자 : yun young
 * 문제내용 : 양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오.
 * 최하위 비트(least significant bit, lsb)의 위치는 0이다.
 * 입   력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 <= T <= 10, 1 <= n <= 10^6)
 * 출   력 : 각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.
 *
 */
public class Solution3460 {
	public static void main(String[] args) {
		Solution3460 solution = new Solution3460();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0) {
			int n = sc.nextInt();
			ArrayList<Integer> result = new ArrayList<>();
			while (n > 1) {
				int remain = n % 2;
				result.add(remain);
				n /= 2;
			}
			result.add(1);
			t--;
	
		
			for (int i = 0; i < result.size(); i++) {
				if (result.get(i) == 1) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
