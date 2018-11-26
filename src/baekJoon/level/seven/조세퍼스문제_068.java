package baekJoon.level.seven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 문제번호 : 1158번 
 * 문제제목 : 조세퍼스 문제
 * 작 성 자 : Ryan Yun
 * 문제내용 : 조세퍼스 문제는 다음과 같다. 
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(<=N)이 주어진다. 
 * 이제 순서대로 M번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라
 * 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 
 * 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다. 
 * 
 * 예를 들어 (7,3)-조세퍼스 순열은 <3,6,2,7,5,1,4> 이다.
 * N과 M이 주어지면 (N, M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.
 * 
 * 입  력 : 첫째 줄에 N과 M이 빈 칸을 사이에 두고 순서대로 주어진다. (1<=M<=N<=5,000)	
 * 출  력 : 에제와 같이 조세퍼스 순열을 출력한다. 
 *
 */
public class 조세퍼스문제_068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		
		int M = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			q1.offer(i+1);
		}
		
		int count = 1;
		while(!q1.isEmpty()) {
			if(count % M == 0) {
				q2.offer(q1.poll());
			}
			if(count % M != 0) {
				q1.offer(q1.poll());	// 뺏다가 다시 넣으면 순서가 원래대로 돌아간다.
			}
			count++;
		}
		System.out.print("<" + q2.poll());
		while(!q2.isEmpty()) {
			System.out.print(", " + q2.poll());
		}
		System.out.print(">");
	}
}
