package programmers.challenge.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 문제제목 : 평균 구하기
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12944
 * 작 성  일 : 2019.05.03
 * 작 성  자 : yun young
 * 문제설명 : 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 제한사항 
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 * 입출력 예:
 * arr: [1,2,3,4] return: 2.5
 * arr: [5,5] return 5
 *
 */
class Solution6 {
	public double solution(int[] arr) {
		double answer = 0;	
		IntStream result = Arrays.stream(arr);
		answer = result.average().getAsDouble();
		return answer;
	}
}