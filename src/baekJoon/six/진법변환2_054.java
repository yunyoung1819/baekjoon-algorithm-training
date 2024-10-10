package baekJoon.six;

import java.util.Scanner;

/**
 * 문제번호 : 11005
 * 문제제목 : 진법 변환 2
 * 작 성 일 : 2018.10.05
 * 작 성 자 : Ryan Yun
 * 문제내용 : 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이   
 * 알파벳 대문자를 사용한다.
 * A:10, B:11, ... , F:15, ... , Y:34, Z:35
 * 
 * 입   력 : 첫째 줄에 N과 B가 주어진다. (2<=B<=36) N은 10억보다 작거나 같은 자연수이다.
 * 출   력 : 첫째 줄에 10진법 수 N을 B진법으로 출력한다.
 * 
 */
public class 진법변환2_054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		StringBuilder result = new StringBuilder();
		
		while(n > 0) {
			int r = n % b;  // 10진법 수 n을 바꾸려는 b진법 수로 계속 나눈다.
			if(r < 10) {
				result.append((char)(r + '0'));
			}else {
				result.append((char)(r - 10 + 'A'));
			}
			n /= b;
		}
		
		System.out.println(result.reverse());
		
		sc.close();
	}
} 
