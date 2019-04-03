package baekJoon.level.eight;

import java.util.Scanner;

import java.util.Scanner;

/**
 * 문제번호 : 10808번 
 * 문제제목 : 알파벳 개수 
 * 작 성 일 : 2019.04.03
 * 작 성 자 : yun young
 * 
 * 문제내용 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 출   력 : 단어에 포함되어 있는 a의 개수, b의 개수, ..., z의 개수를 공백으로 구분해서 출력한다. 
 *
 */
public class Solution10808 {
	
	public static void main(String[] args) {
		Solution10808 solution = new Solution10808();
		solution.go();
	}

	public void go() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] alphabet = new char[26];  // 알파벳 소문자 26개 
		int[] answer = new int[26];		 // count 배열 
		
		// 알파벳 소문자 배열 만들기 
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (i + 97);
		}
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (s.charAt(i) == alphabet[j]) {
					answer[j]++;
				}		
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");	// 출력 
		}
	}
}