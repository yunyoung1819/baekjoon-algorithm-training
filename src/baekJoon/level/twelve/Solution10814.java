package baekJoon.level.twelve;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 문제번호 : 10814번 
 * 문제제목 : 나이순 정렬 
 * 문제링크 : https://www.acmicpc.net/problem/10814
 * 작 성 일 : 2020.04.15 
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 온라인 저지에 가입한 사람들의 나이와 이름이 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로,
 * 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1<=N<=100,000)
 * 둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고,
 * 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.
 * 
 * 출   력 : 첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 
 * 나이와 이름을 공백으로 구분해 출력한다. 
 */
public class Solution10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 온라인 저지 회원 수 
		int count = sc.nextInt();
		String[][] member = new String[count][2];
		
		for (int i = 0; i < member.length; i++) {
			for (int j = 0; j <= 1; j++) {
				member[i][j] = sc.next();
			}
		}
		
		Arrays.sort(member, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if (Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])) {
					return 1;
				} else if (Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])) {
					return -1;
				}
				return 0;
			}
		});
		
		for (int k = 0; k < member.length; k++) {
			for (int l = 0; l <= 1; l++) {
				System.out.print(member[k][l] + " ");
			}
			System.out.println("");
		}
		sc.close();
	}
}