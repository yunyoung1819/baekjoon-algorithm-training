package programmers.level.one;

/**
 * 문제제목 : 수박수박수박수박수박수?
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12922
 * 작 성 일 : 2019.05.04
 * 작 성 자 : yun young
 * 
 * 문제설명 : 길이가 n이고, "수박수박수박수..."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 * 
 * 제한조건 
 * n은 길이 10,000 이하인 자연수 입니다.
 * 
 * 입출력예
 * n : 3 return : "수박수"
 * n : 4 return : "수박수박"
 */
class Solution8 {
	public String solution(int n) {
		char[] words = new char[n];
		
		for (int i = 0; i < n; i++) {
			if (i%2 == 0) {
				words[i] = '수';
			}
			else {
				words[i] = '박';
			}
		}
		return new String(words);
	}
}