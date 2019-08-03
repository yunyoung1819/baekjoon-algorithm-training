package programmers.level.two;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제제목 : 전화번호 목록 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/42577
 * 작 성 일 : 2019.07.21
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지
 * 확인하려 합니다. 
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 * 
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book이 solution 함수의 매개변수로 주어질 때,
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록
 * solution 함수를 작성해주세요.
 * 
 * 제한사항
 * phone_book의 길이는 1이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 *
 */
public class PhoneBook {
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		String[] phone_book1 = {"119", "97674223", "1195524421"};
		String[] phone_book2 = {"123", "456", "789"};
		String[] phone_book3 = {"12","123","1235","567","88"};

		phoneBook.solution(phone_book1);
	}

	private boolean solution(String[] phoneBook) {
		Map<Integer, String> phoneBookMap = new HashMap<Integer, String>();
		
		for (int i = 0; i < phoneBook.length; i++) {
			phoneBookMap.put(i, phoneBook[i]);
		}
		
		return false;
	}

}
