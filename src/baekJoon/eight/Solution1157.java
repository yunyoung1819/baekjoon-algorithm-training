package baekJoon.eight;

import java.util.Scanner;

/**
 * 문제번호 : 1157번 
 * 문제제목 : 단어 공부 
 * 작 성 일 : 2019.04.04
 * 작 성 자 : yun young
 * 
 * 문제내용 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 
 * 입   력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 출   력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는
 * 경우에는 ?를 출력한다.
 * 
 * 해   법 
 * 1) for i = 0 부터 word의 길이까지
 * 2) 현재 알파벳 위치의 카운트 배열에 +1 한다.
 * 3) if 현재 알파벳 카운트보다 max가 크다면
 * 4) answer = 현재 알파벳
 * 5) max = 현재 알파벳의 카운트 수
 * 6) else if 현재 알파벳 카운트가 max와 같다면
 * 7) answer = '?'
 * 위 과정을 문자열의 길이만큼 반복한다. 
 *
 */
public class Solution1157 {
	public static void main(String[] args) {
		Solution1157 solution = new Solution1157();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		word = word.toUpperCase();
		int[] count = new int[26];
		int max = 0;
		char answer = 0;
		
		for (int i = 0; i < word.length(); i++) {
			count[word.charAt(i) - 65]++;
			if (count[word.charAt(i) - 65] > max) {
				answer = word.charAt(i);
				max = count[word.charAt(i) - 65];
			} else if (count[word.charAt(i) - 65] == max) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}	
}
