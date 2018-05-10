package baekJoon.level.one;

import java.util.Scanner;

/**
 * N 찍기
 * 
 * 문제번호 : 2741번
 * 풀이일시 : 2018.04.29
 * 풀이자 : 윤영
 * 문제내용 : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 100,000 보다 작거나 같은 자연수 N이 주어진다.
 * 출력 : 첫째 줄부터 N번째 줄까지 차례대로 출력한다.
 *
 */
public class N찍기_06 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		if(inputNum <= 100000 && inputNum > 0) {
			for(int i = 1; i <= inputNum; i++) {
				System.out.println(i);
			}
		}
	}
}
