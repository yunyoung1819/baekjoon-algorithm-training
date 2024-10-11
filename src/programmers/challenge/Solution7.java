package programmers.challenge;

/**
 * 문제제목 : x만큼 간격이 있는 n개의 숫자
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12954
 * 작 성  일 : 2019.05.03
 * 작 성  자 : YUN YOUNG
 * 문제설명 : 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 
 * 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 * 제한조건 
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 * 입출력의 예
 * x:2 n:5 answer: [2,4,6,8,10]
 * x:4 n:3 answer: [4,8,12]
 * x:-4 n:2 answer: [-4,-8]
 *
 */
class Solution7 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < answer.length; i++) {
			if (i == 0) {
				answer[i] = x;
			} else if (i > 0) {
				answer[i] = answer[i-1] + x;
			}
		}
		return answer;
	}
}