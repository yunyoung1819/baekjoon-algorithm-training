package programmers.level.one;

import java.util.Scanner;

/**
 * 문제번호 : Level 1
 * 문제제목 : 이상한 문자 만들기 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12930?language=java
 * 작 성 일 : 2020.04.04
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백 문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * 
 * 제한사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 * 
 * 입출력 예
 * s: "try hello world" return: "TrY HeLlO WoRlD"
 *
 */
public class StrangeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String answer = "";
		
		StrangeString ssr = new StrangeString();
		answer = ssr.convertString(s);
		
		sc.close();
	}

	public String convertString(String s) {
		String[] strArray = s.split(" ", -1);
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < strArray.length; i++) {
			char[] charArray = strArray[i].toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				// 짝수인 경우 대문자로 변경 
				if (j % 2 == 0) {
					charArray[j] = Character.toUpperCase(charArray[j]);
				} else {	// 홀수인 경우 소문자로 변경
					charArray[j] = Character.toLowerCase(charArray[j]);
				}
			}
			if (i != strArray.length -1) {
				result.append(new String(charArray) + " ");
			} else {
				result.append(new String(charArray));
			}
		}
		return result.toString();
	}
}
