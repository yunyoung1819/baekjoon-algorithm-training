package baekJoon.level.two;

import java.util.Scanner;

/**
 * 문제번호 : 11654번
 * 문제제목 : 아스키 코드
 * 문제내용 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * 입 력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 출 력 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 *
 */
public class 아스키코드_019 {
	public static void main(String[] args) {
		char ch1;
		Scanner input = new Scanner(System.in);
		ch1 = input.next().charAt(0);
		
		System.out.println((int)ch1);
	}
}
