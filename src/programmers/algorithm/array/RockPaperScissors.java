package programmers.algorithm.array;

import java.util.Scanner;

/**
 * 문제 제목: 가위 바위 보
 * 문제 설명: A,B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N = 5이면
 *
 *   회수    : 1 2 3 4 5
 *   A의 정보: 2 3 3 1 3
 *   B의 정보: 1 1 2 2 3
 *   승자   : A B A B D
 *
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 * 입    력: 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 *          두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *          세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 출    력: 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 * 예시 입력1:
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 *
 * 예시 출력1: A B A B D
 *
 * Question title: Rock, paper, scissors.
 * Problem description: A and B play rock-paper-scissors. A total of N games are played to print out A if A wins, and B if B wins.
 * If tied, output D. The information of rock, paper, scissors is determined by 1: scissors, 2: rock, and 3: paper.
 * For example, if N = 5,
 *
 * Number of times: 1, 2, 3, 4, 5
 * Information from A: 2 3 3 1 3
 * Information from B: 1 1 2 2 3
 * Winner: A B B B D
 *
 * Write a program to print out who won each time given the information of two people's rounds of rock, paper, and scissors.
 */
public class RockPaperScissors {
	private String solution(int n, int[] playerA, int[] playerB) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (playerA[i] == playerB[i]) {
				answer += "D";
			} else if (playerA[i] == 1 && playerB[i] == 3) {
				answer += "A";
			} else if (playerA[i] == 2 && playerB[i] == 1) {
				answer += "A";
			} else if (playerA[i] == 3 && playerB[i] == 2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		RockPaperScissors rockPaperScissors = new RockPaperScissors();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] playerA = new int[n];
		int[] playerB = new int[n];
		for (int i = 0; i < n; i++) {
			playerA[i] = kb.nextInt();
		}
		for (int i = 0; i < n; i++) {
			playerB[i] = kb.nextInt();
		}
		String answer = rockPaperScissors.solution(n, playerA, playerB);
		for (char x : answer.toCharArray()) {
			System.out.println(x);
		}
		kb.close();
	}
}
