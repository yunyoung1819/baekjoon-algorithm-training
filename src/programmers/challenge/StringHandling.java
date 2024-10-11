package programmers.challenge;

import java.util.Scanner;

/**
 * 문제번호 : Programmers Level 1
 * 문제제목 : 문자열 다루기 기본 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12918
 * 작 성 일 : 2019.11.26
 * 작 성 자 : YUN YOUNG
 * 
 * 문제내용 : 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수 solution을 완성하세요. 
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 * 
 */
public class StringHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringHandling strHandling = new StringHandling();
		System.out.println(strHandling.isNumber(s));
		
		sc.close();
	}

	private boolean isNumber(String s) {
		boolean result = true;
		int length = s.length();
		int[] charArray = new int[length];
		
		if (length != 4 && length != 6) {
			return false;
		}
		
		for (int i = 0; i < length; i++) {
			charArray[i] = s.charAt(i);
			if (charArray[i] < 48 || charArray[i] > 57) {
				return false;
			}
		}
		return result;
	}
}
