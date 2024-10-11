package programmers.challenge;

import java.util.Scanner;

/**
 * 문제번호 : Level 1.
 * 문제제목 : 핸드폰 번호 가리기 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12948
 * 작 성 일 : 2020.01.01
 * 작 성 자 : YUN YOUNG
 * 
 * 문제내용 : 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 
 * 문자열을 리턴하는 함수, solution을 완성해주세요.
 * 
 * 제한조건 
 * s는 길이 4이상, 20이하인 문자열입니다.
 * 
 */
public class CoveringCellPhoneNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phoneNumber = sc.next();
		CoveringCellPhoneNumber coveringCellPhoneNumber = new CoveringCellPhoneNumber();
		System.out.println(coveringCellPhoneNumber.solution(phoneNumber));
		sc.close();
	}

	private String solution(String phone_number) {
		int phoneNumberLength = phone_number.length();
		String frontNumber = phone_number.substring(0, phoneNumberLength-4).replaceAll(".", "*");
		String backNumber = phone_number.substring(phoneNumberLength-4, phoneNumberLength);
		String answer = frontNumber.concat(backNumber);
		
		return answer;
	}
}
