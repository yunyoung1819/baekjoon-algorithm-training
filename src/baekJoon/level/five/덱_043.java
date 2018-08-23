package baekJoon.level.five;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * 문제번호 : 10866번
 * 문제제목 : 덱
 * 작 성 자 : Yun Young
 * 문제내용 : 정수를 저장하는 덱(Deque)을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 
 * 명령은 총 여덟 가지이다.
 * 
 * push_front X : 정수 X를 덱의 앞에 넣는다.
 * push_back X : 정수 X를 덱의 뒤에 넣는다.
 * 
 * pop_front : 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * pop_back : 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 
 * size : 덱에 들어있는 정수의 개수를 출력한다.
 * empty : 덱이 비어있으면 1을, 아니면 0을 출력한다.
 * front : 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back : 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 
 * 입     력 : 첫째 줄에 주어지는 명령의 수 N (1<= N <= 10,000)이 주어진다. 둘째 줄부터는 N개의 줄에 명령이 하나씩 주어진다.
 * 주어지는 정수는 1보다 크거나 같고 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 
 * 출     력 : 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다. 
 *
 */
public class 덱_043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayDeque<Integer> dequeue = new ArrayDeque<Integer>();  // 덱 선언
		
		for (int k = 0; k < n; k++) {
			String line = sc.nextLine();
			String[] s = line.split(" ");
			String cmd = s[0];

			putCmd(dequeue, s, cmd);
		}
		sc.close();
	}

	private static void putCmd(ArrayDeque<Integer> dequeue, String[] s, String cmd) {
		if(cmd.equals("push_front")) {
			int num = Integer.parseInt(s[1]);
			dequeue.offerFirst(num);
		}else if(cmd.equals("push_back")) {
			int num = Integer.parseInt(s[1]);
			dequeue.offerLast(num);
		}else if(cmd.equals("front")) {
			if(dequeue.isEmpty()) {
				System.out.println("-1");
			}else{
				System.out.println(dequeue.peekFirst());
			}
		}else if(cmd.equals("size")) {
			System.out.println(dequeue.size());
		}else if(cmd.equals("empty")) {
			if(dequeue.isEmpty()) {
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}else if(cmd.equals("pop_front")) {
			if(dequeue.isEmpty()) {
				System.out.println("-1");
			}else{
				System.out.println(dequeue.pollFirst());
			}
		}else if(cmd.equals("pop_back")) {
			if(dequeue.isEmpty()) {
				System.out.println("-1");
			}else{
				System.out.println(dequeue.pollLast());
			}
		}else if(cmd.equals("back")) {
			if(dequeue.isEmpty()) {
				System.out.println("-1");
			}else{
				System.out.println(dequeue.peekLast());
			}
		}
	}
}
