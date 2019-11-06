package programmers.level.two;

import java.util.LinkedList;

/**
 * 문제제목 : 제일 작은 수 제거하기  
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12935
 * 작 성 일 : 2019.11.06
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 정수를 저장한 배열, arr에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
 * solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를 들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴하고 [10]이면 [-1]을 리턴합니다.
 * 
 * 제한조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i != j 이면 arr[i] != arr[j] 입니다.
 */
public class DeleteSmallestNumber {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		DeleteSmallestNumber deleteSmallestNumber = new DeleteSmallestNumber();
		deleteSmallestNumber.removeSmallestNumber(arr);
	}

	private int[] removeSmallestNumber(int[] arr) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		if (list.size() != 1) {
			for (int i = 1; i < list.size(); i++) {
				int minValue = list.get(index);
				if (list.get(i) < minValue) {
					minValue = list.get(i);
					index = i;
				}
			}
			list.remove(index);
		} else {
			return new int[]{-1};
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
