package programmers.challenge.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 문제제목 : 모의고사 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/42840
 * 작 성 일 : 2019.07.06
 * 작 성 자 : yun young
 * 
 * 문제설명 : 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 
 * 전부 찍으려합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answer가 주어졌을 때,
 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 
 * 작성해주세요.
 * 
 * 제한조건 
 * 시험은 최대 10,000 문제로 구성되어 있습니다.
 * 문제의 정답은 1,2,3,4,5 중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 * 
 */
public class MockTest {
	public static void main(String[] args) {
		int[] answer = {1,2,3,4,5};
		MockTest mockTest = new MockTest();
		System.out.println(mockTest.solution(answer));
	}

	private int[] solution(int[] answer) {
		int[] student1 = {1,2,3,4,5,1,2,3,4,5};
		int[] student2 = {2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5};
		int[] student3 = {3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5};
		
		Map<Integer, Integer> answerCountMap = new HashMap<>();
		answerCountMap.put(1, 0);
		answerCountMap.put(2, 0);
		answerCountMap.put(3, 0);
		
		// 정답 개수 Count
		for (int i = 0; i < answer.length; i++) {
			if (student1[i%student1.length] == answer[i]) {
				answerCountMap.replace(1, answerCountMap.get(1)+1);
			}
			if (student2[i%student2.length] == answer[i]) {
				answerCountMap.replace(2, answerCountMap.get(2)+1);
			}
			if (student3[i%student3.length] == answer[i]) {
				answerCountMap.replace(3, answerCountMap.get(3)+1);
			}
		}
		
		// 최대 정답갯수 구하기 
		int maxAnswerCount = Math.max(answerCountMap.get(1), Math.max(answerCountMap.get(2), answerCountMap.get(3)));
		
		// 학생 리스트 생성 
		ArrayList<Integer> highestStudent = new ArrayList<>();
		
		for (Integer key : answerCountMap.keySet()) {
			if (answerCountMap.get(key) == maxAnswerCount) {
				highestStudent.add(key);
			}
		}
		
		// 정렬 및 배열로 변환 
		Collections.sort(highestStudent);
		
		int[] result = new int[highestStudent.size()];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = highestStudent.get(i);
		}
		
		return result;
	}
}
