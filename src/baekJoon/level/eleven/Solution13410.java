package baekJoon.level.eleven;

import java.util.*;

/**
 * 문제번호 : 13410 
 * 문제제목 : 거꾸로 구구단 
 * 문제링크 : https://www.acmicpc.net/problem/13410
 * 작 성 일 : 2020.02.16
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 일반적인 구구단에서 가장 큰 수는 마지막 항의 값이 제일 크다. 거꾸로 구구단에서는, 각 항에 구구단의 계산 결과로 나온 값을 뒤집어 저장을 한다.
 * 이렇게 하면 가장 큰 값이 항상 마지막이 아니게 된다. 예를 들어 8단의 9개 항의 값은 8,16,24,32,40,48,56,64,72 이 되어 72가 가장 크지만, 
 * 거꾸로 구구단에서는 8,61,42,23,4,84,65,46,27 가 되어 84가 가장 큰 값을 가지게 된다.
 * 단의 수 N과 항의 수 K가 주어질 때, 거꾸로 구구단의 가장 큰 값을 출력하는 프로그램을 작성하시오.
 * 입   력 : 첫째 줄에 N과 K가 주어진다. 두 수는 모두 1,000보다 작거나 같은 자연수이다.
 * 출   력 : 첫째 줄에 주어진 단과 항에서 나올 수 있는 가장 큰 거꾸로 구구단의 값을 출력한다.
 */
public class Solution13410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		int hang = sc.nextInt();
		
		Solution13410 solution = new Solution13410();
		System.out.println(solution.reverseMultiplicationTable(dan, hang));
		
		sc.close();
	}

	private int reverseMultiplicationTable(int dan, int hang) {
		ArrayList<Integer> multiplicationTable = new ArrayList<Integer>();
		
		for (int i = dan; i <= dan; i++) {
			for (int j = 1; j <= hang; j++) {
				String number = String.valueOf(i * j);
				number = new StringBuilder().append(number).reverse().toString();
				multiplicationTable.add(Integer.parseInt(number));
			}
		}
		
		Collections.sort(multiplicationTable);
		int lastIndex = multiplicationTable.size() - 1;
		
		return multiplicationTable.get(lastIndex);
	}
}
