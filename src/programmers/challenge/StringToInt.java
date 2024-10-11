package programmers.challenge;

/**
 * 문제제목 : 문자열을 정수로 바꾸기
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12925
 * 작 성 일 : 2019.05.18
 * 작 성 자 : yun young
 * 문제내용 :  문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 * 제한조건
 * s의 길이는 1 이상 5 이하입니다. 
 * s의 맨앞에는 부호(+,-)가 올 수 있습니다.
 * s는 부호와 숫자로만 이루어져있습니다.
 * s는 "0"으로 시작하지 않습니다.
 */
public class StringToInt {
	public static void main(String[] args) {
		StringToInt sti = new StringToInt();
		System.out.println(sti.stringtoInt("1234"));
		System.out.println(sti.stringtoInt("-1234"));
	}
	
	private int stringtoInt(String s) {
		return Integer.parseInt(s);
	}
}
