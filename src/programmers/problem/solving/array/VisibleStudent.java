package programmers.problem.solving.array;

import java.util.*;

/**
 * 문제 제목: 보이는 학생
 * 문제 설명: 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. 
 * (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다)
 * 
 * 입     력: 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 * 출     력: 선생님이 볼 수 있는 최대학생수를 출력한다.
 * 
 * 예시 입력: 
 * 8
 * 130 135 148 140 145 150 150 153
 * 
 * 예시 출력:
 * 5
 *
 */
public class VisibleStudent {	
	private int solution(int[] height) {
		int count = 0;
		int taller = 0;
		for (int i = 0; i < height.length; i++) {	
			if (i == 0) {
				taller = height[0];
				count++;
			} else if (taller < height[i]) {
				taller = height[i];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n];
		
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}
		VisibleStudent visibleStudent = new VisibleStudent();
		int answer = visibleStudent.solution(height);
		
		System.out.print(answer);
		sc.close();
	}
}
