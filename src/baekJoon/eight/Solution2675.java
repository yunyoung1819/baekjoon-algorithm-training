package baekJoon.eight;

import java.util.Scanner;

/**
 * 문제번호 : 2675번
 * 문제제목 : 문자열 반복 
 * 문제링크 : https://www.acmicpc.net/problem/2675
 * 작 성 일 : 2019.04.28
 * 작 성 자 : yun young
 * 
 * 문제내용 : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
 * S에는 QR Code "alphanumeric"문자만 들어있다.
 * QR Code "alphanumeric"문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 * 
 * 입   력 : 첫째 줄에 테스트 케이스의 개수 T(1 <= T <= 1,000)가 주어진다. 
 * 각 테스트 케이스는 반복 횟수 R(1<=R<=8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
 * 
 * 출    력 : 각 테스트 케이스에 대해 P를 출력한다.
 *
 */
public class Solution2675 {
	public static void main(String[] args) {
		Solution2675 solution = new Solution2675();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	// 테스트 케이스의 개수 T
		
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();	// 반복횟수 R
			String s = sc.next();	// 입력받은 문자열 S
			String p = "";	// 새 문자열 p
			
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					p += s.charAt(j);
				}
			}
			
			p = p.replaceAll(" ", "");
			System.out.println(p);
		}
		sc.close();
	}
}
