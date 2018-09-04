package baekJoon.level.six;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 문제번호 : 15552번
 * 문제제목 : 빠른 A+B
 * 작 성 자 : Ryan Yun
 * 문제내용 : 본격적으로 for문 문제를 풀기 전에 주의해야할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 * 
 * C++ 을 사용하고 있고 cin / cout을 사용하고자 한다면 cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해주고, endl 대신
 * 개행문자(\n)를 쓰자. 단 이렇게 하면 더 이상 scanf / printf / puts / getchar / putchar 등 C의 입출력 방식을 사용하면 안된다.
 * 
 * Java를 사용하고 있다면 Scanner 와 System.out.println 대신 BufferedReader 와 BufferedWriter를 사용할 수 있다.
 * BufferedWriter.flush 는 맨 마지막에 한 번만 하면 된다.
 * 
 * Python을 사용하고 있다면 input 대신 sys.stdin.readline을 사용할 수 있다. 단 이 때는 맨 끝의 개행문자까지 같이 입력받기 때문에
 * 묹열을 저장하고 싶을 경우 .rstrip()을 추가로 해주는 것이 좋다.
 * 
 * 또한 입력과 출력 스트림은 별개이므로, 테스트 케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트 케이스를 하나 받은 뒤 하나 출력해도 된다.
 * 
 * 입    력 : 첫 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 1,000,000 이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다.
 * A와 B는 1 이상 1,000 이하이다.
 * 
 * 출    력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 *
 * 문제풀이 : 이 문제는 Scanner를 이용했다면 정말 간단하게 풀 수 있는 문제이다. 그러나 테스트 케이스가 작다면 Scanner를 사용했을 때 시간상 문제가 없겠지만
 * 1,000개, 10,000ro, ... 이상이 되면 여러번 Scanner를 호출하는 것이므로 시간상 비효율적이다. 이때 Buffer를 이용해서 비효율적인 행동을 줄인다.
 * Java가 제공하는 BufferedReader, BufferedWriter를 사용한다.
 */
public class 빠른APlusB_051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for (int i = 0; i < t; i++) {
			String input = br.readLine();
			String[] result = input.split(" ");
			int a = Integer.parseInt(result[0]);
			int b = Integer.parseInt(result[1]);
			bw.write((a+b) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
