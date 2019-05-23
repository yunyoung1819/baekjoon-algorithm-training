package programmers.level.one;

/**
 * 문제제목 : 자연수 뒤집어 배열로 만들기
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12932
 * 작 성 일 : 2019.05.23
 * 작 성 자 : YUN YOUNG
 * 
 * 문제설명 : 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를 들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * 제한조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력예 
 * n: 12345 return: [5,4,3,2,1]
 *
 */
public class ReverseInt {
	public static void main(String[] args) {
		long n = 12345;
		ReverseInt ri = new ReverseInt();
	}

	private int[] reverseInt(long n) {
		String str = String.valueOf(n);
		int length = str.length();
		int[] answer = new int[length];
		
		for (int i = 0; i < answer.length; i++) {
			String temp = String.valueOf(str.charAt(--length));
			answer[i] = Integer.parseInt(temp);
		}
		return answer;
	}
}
