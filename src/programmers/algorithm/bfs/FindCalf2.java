package programmers.algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기
 * 문제 설명
 * 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치 추적기가 달려있다.
 * 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
 * 송아지는 움직이지 않고 제 자리에 있다.
 * 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
 * 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
 *
 * 입  력: 첫 번쨰 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
 * 출  력: 점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
 *
 */
public class FindCalf2 {
	private int solution(int s, int e) {
		int[] dis = {1, -1, 5};
		int level = 0;
		int[] checked = new int[100001];
		Queue<Integer> queue = new LinkedList<>();
		checked[s] = 1;
		queue.offer(s);

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int value = queue.poll();
				if (value == e) {
					return level;
				} else {
					for (int j = 0; j < dis.length; j++) {
						int nextValue = value + dis[j];
						if (nextValue >= 1 && nextValue <= 10000 && checked[nextValue] == 0) {
							queue.offer(nextValue);
							checked[nextValue] = 1;
						}
					}
				}
			}
			level++;
		}
		return level;
	}

	public static void main(String[] args) {
		FindCalf2 findCalf = new FindCalf2();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int result = findCalf.solution(s, e);
		System.out.println(result);
		sc.close();
	}
}
