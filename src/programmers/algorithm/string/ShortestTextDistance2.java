package programmers.algorithm.string;

import java.util.Scanner;

/**
 * 예시 입력1: teachermode e
 * 예시 출력1: 1 0 1 2 1 0 1 2 2 1 0
 */
public class ShortestTextDistance2 {
	private static int[] solution(String s, String target) {
		int[] answer = new int[s.length()];
		char t = target.charAt(0);
		int distance = 1000;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				distance = 0;
				answer[i] = distance;
			} else {
				distance++;
				answer[i] = distance;
			}
		}

		distance = 1000;
		for (int j = s.length() - 1; j >= 0; j--) {
			if (s.charAt(j) == t) {
				distance = 0;
			} else {
				distance++;
				answer[j] = Math.min(answer[j], distance);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		String t = sc.next();
		int[] arr = solution(s, t);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
