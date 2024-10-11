package programmers.challenge;

/**
 * 문제제목: 자릿수 더하기 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12931
 * 작 성 일  : 2019.06.02
 * 작 성 자 : YUN YOUNG
 * 문제설명 : 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어주세요.
 * 예를 들어 N = 123 이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * 제한사항 
 * N의 범위 : 100,000,000 이하의 자연수
 */
public class SumDigit {
	// test code
	public static void main(String[] args) {
		SumDigit sumDigit = new SumDigit();
		System.out.println(sumDigit.solution(123));
		System.out.println(sumDigit.solution(1234));
	}

	private int solution(int n) {
		String tempStr = String.valueOf(n);
		char[] arr = tempStr.toCharArray();
		int answer = 0;
		
		for (int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(String.valueOf(arr[i]));
		}
		
		return answer;
	}
}
