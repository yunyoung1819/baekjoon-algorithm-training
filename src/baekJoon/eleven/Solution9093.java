package baekJoon.eleven;

import java.util.Scanner;
import java.util.Stack;

/**
 * 문제번호 : 9303번 
 * 문제제목 : 단어 뒤집기 
 * 문제링크 : https://www.acmicpc.net/problem/9093
 * 작 성 일 : 2019.12.29
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다.
 * 단어는 영어 알파벳으로만 이루어져 있다.
 * 입   력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다.
 * 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다. 
 * 출   력 : 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다. 
 * 
 */
public class Solution9093 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 테스트 케이스의 개수
		int t = scan.nextInt();
		// 개행 문자 처리 
		scan.nextLine();
		
		for (int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack<>();
			String words = scan.nextLine();
			for (int j = 0; j < words.length(); j++) {
				if (words.charAt(j) == ' ') {
					while (!stack.empty()) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				} else {
					stack.add(words.charAt(j));
				}
			}
			while (!stack.empty()) {
				System.out.print(stack.pop());
			}
			System.out.println();
		}
		scan.close();
	}
}
