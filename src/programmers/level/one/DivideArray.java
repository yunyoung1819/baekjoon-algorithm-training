package programmers.level.one;

import java.util.Arrays;

/**
 * 문제제목 : 나누어 떨어지는 숫자 배열
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12910
 * 작 성 일 : 2019.06.15
 * 작 성 자 : yun young
 * 
 * 문제설명 : array 의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수,
 * solution을 작성해주세요.
 * divisor 로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 * 
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다. 
 *
 */
public class DivideArray {
	
	public static void main(String[] args) {
		DivideArray divideArray = new DivideArray();
		int[] arr1 = {5, 9, 7, 10};
		int[] arr2 = {2, 36, 1, 3};
		int[] arr3 = {3, 2, 6};
		
		divideArray.solution(arr1, 5);
		divideArray.solution(arr2, 1);
		divideArray.solution(arr3, 10);
	}

	private int[] solution(int[] arr, int divisor) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				count = count + 1;
			}
		}
		
		if (count == 0) {
			count = 1;
		}
		
		int[] answer = new int[count];
		
		for (int i = 0; i < answer.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[i] = arr[i];
			} else {
				answer[i] = -1;
			}
		}
		
		Arrays.sort(answer);
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println("");
		
		return answer;
	}

}
