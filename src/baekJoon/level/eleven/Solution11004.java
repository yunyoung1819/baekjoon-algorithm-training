package baekJoon.level.eleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * 문제번호 : 11004번
 * 문제제목 : K번째 수 
 * 문제링크 : https://www.acmicpc.net/problem/11004
 * 알고리즘 분류 : 정렬 
 * 작 성 일 : 2020.02.01
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.
 * 입   력 : 첫째 줄에 N (1<=N<=5,000,000)과 K(1<=K<=N)이 주어진다.
 * 둘째에는 A1, A2, ..., AN이 주어진다. (-10^9 <= Ai <= 10^9)
 * 출   력 : A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.
 *
 */
public class Solution11004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(input.nextInt());
		}
		
		Collections.sort(list);
		System.out.println(list.get(k-1));
		input.close();
	}
}
