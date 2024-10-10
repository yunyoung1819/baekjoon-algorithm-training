package programmers.algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기 1 (BFS 상태 트리 탐색)
 *
 * 문제 설명
 * 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려있다.
 * 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
 * 송아지는 움직이지 않고 제자리에 있다.
 * 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
 * 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
 *
 * 입 력: 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
 * 출 력: 점프의 최소 횟수를 구한다. 답은 1이상이며 반드시 존재한다.
 *
 * 예시 입력 1: 5 14
 * 예시 출력 1: 3
 */
public class FindCalf1 {
	int answer = 0;
	int [] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();

	public static void main(String[] args) {
		FindCalf1 C = new FindCalf1();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();  // 현수의 출발점
		int e = kb.nextInt();  // 도착점 (송아지 위치(
		System.out.println(C.BFS(s, e));
	}

	private int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if (nx == e) return L + 1;
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
}
