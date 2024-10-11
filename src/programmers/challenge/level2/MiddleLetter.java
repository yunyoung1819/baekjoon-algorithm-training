package programmers.challenge.level2;

import java.util.Scanner;

/**
 * 문제 제목 : 가운데 글자 가져오기 
 * 문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12903
 * 작 성 일 : 2019.12.13
 * 작 성 자 : YUN YOUNG
 * 문제 내용 : 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 제한 사항 : s는 길이가 1 이상, 100 이하인 스트링입니다. 
 */
public class MiddleLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		MiddleLetter midLetter = new MiddleLetter();
		System.out.println(midLetter.findMiddleLetter(s));
		
		sc.close();
	}

	private String findMiddleLetter(String s) {
		String answer = "";
		int midIndex = s.length()/2;
		if (s.length()%2 == 0) {
			answer = String.valueOf(s.charAt(midIndex-1)).concat(String.valueOf(s.charAt(midIndex)));
		} else {
			answer = String.valueOf(s.charAt(midIndex));
		}
		return answer;
	}
}
