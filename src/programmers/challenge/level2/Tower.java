package programmers.challenge.level2;

import java.util.Stack;

/**
 * 
 * 문제번호 : Programmers Level 2.
 * 문제제목 : 탑 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/42588
 * 작 성 일 : 2020.02.22
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 수평 직선에 탑 N대를 세웠습니다. 모든 탑의 꼭대기에는 신호를 송/수신하는 장치를 설치했습니다.
 * 발사한 신호는 신호를 보낸 탑보다 높은 탑에서만 수신합니다. 또한, 한번 수신된 신호는 다른 탑으로 송신되지 않습니다.
 * 
 * 예를 들어 높이가 6,9,5,7,4인 다섯 탑이 왼쪽으로 동시에 레이저 신호를 발사합니다. 
 * 그러면, 탑은 다음과 같이 신호를 주고받습니다. 높이가 4인 다섯번째 탑에서 발사한 신호는 높이가 7인 네번째 탑이 수신하고,
 * 높이가 7인 네번째 탑의 신호는 높이가 9인 두번째 탑이, 높이가 5인 세번째 탑의 신호도 높이가 9인 두번째 탑이 수신합니다.
 * 높이가 9인 두번째 탑과 높이가 6인 첫번째 탑이 보낸 레이저 신호는 어떤 탑에서도 수신할 수 없습니다.
 * 
 * 송신 탑 (높이)	수신 탑(높이)
 * 5(4)			4(7)
 * 4(7)			2(9)
 * 3(5)			2(9)
 * 2(9)			 -
 * 1(6)			 -
 * 
 * 맨 왼쪽부터 순서대로 탑의 높이를 담은 배열 heights가 매개변수로 주어질 때 각 탑이 쏜 신호를 어느 탑에서 받았는지
 * 기록한 배열을 return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한사항
 * heights는 길이 2이상 100이하인 정수 배열입니다.
 * 모든 탑의 높이는 1이상 100이하입니다.
 * 신호를 수신하는 탑이 없으면 0으로 표시합니다. 
 * 
 * 풀이방법
 * 제일 마지막에 들어온 송신탑을 pop하여 왼쪽에 셋팅된 송신탑의 수신 높이와 비교하고 송신이 가능하다면 +를 해주는 방법으로 풀었다. 
 */
public class Tower {
	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
		Tower tower = new Tower();
		tower.solution(heights);
	}

	private int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		
		//배열을 스택으로 옮겨준다
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < heights.length; i++) {
			st.push(heights[i]);
		}
		
		while (!st.isEmpty()) {
			int temp = st.pop();
			for (int j = st.size(); j >= 0; j--) {
				if (temp < heights[j]) {
					answer[st.size()] = j+1;
					break;
				}
			}
		}
		
//		for (int k = 0; k < answer.length; k++) {
//			System.out.println(answer[k]);
//		}
		
		return answer;
	}
}
