package baekJoon.level.five;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 문제번호 : 10845번
 * 문제제목 : 큐
 * 작 성 자 : Yun Young
 * 문제내용 : 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 
 * 명령은 총 여섯 가지이다.
 * 
 * push X : 정수 X를 큐에 넣는 연산이다.
 * pop : 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없을 경우에는 -1을 출력한다.
 * size : 큐에 들어있는 정수의 개수를 출력한다.
 * empty : 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front : 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back : 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * 입    력 : 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는
 * 명령이 하나씩 주어진다.
 * 출    력 : 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 */
public class 큐_042 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = 0; //마지막 값을 저장할 변수
        sc.nextLine();
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for (int k=0; k<n; k++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            String cmd = s[0];
            
            if (cmd.equals("push")) {
                int num = Integer.parseInt(s[1]);
                last = num;
                queue.offer(num);
            } else if (cmd.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peek());
                }
            } else if (cmd.equals("size")) {
                System.out.println(queue.size());
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.poll()); //제거하며 읽기
                }
            } else if (cmd.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(last);
                }
            }
        }
    }
}
