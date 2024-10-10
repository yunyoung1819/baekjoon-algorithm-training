package baekJoon.ten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 문제번호 : 1181번 
 * 문제제목 : 단어 정렬 
 * 문제링크 : https://www.acmicpc.net/problem/1181
 * 작 성 일 : 2019.09.08
 * 작 성 자 : YUN YOUNG
 * 
 * 문제내용 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
 * 
 * 1. 길이가 짧은 것부터
 * 2. 길이가 같으면 사전 순으로
 * 
 * 입    력 : 첫째 줄에 단어의 개수 N이 주어진다. (1<=N<=20,000) 둘째 줄부터 N개의 줄에 걸쳐 
 * 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
 * 
 * 출    력 : 조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 *
 */
public class Solution1181 {
	public static void main(String[] args) {
		Solution1181 solution = new Solution1181();
		solution.sortingWords();
	}

	private void sortingWords() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		List<String> words = new ArrayList<String>();
		
		for (int i = 0; i < count; i++) {
			String input = sc.next();
			words.add(input);
		}
		
		// 1. 길이가 짧은 것부터
		Collections.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() < o2.length() ? -1 : 0;
			}
		});
		
		// 2. 길이가 같으면 사전 순으로
		for (int i = 0; i < words.size(); i++) {
			if (i != words.size()-1) {
				if (words.get(i).length() == words.get(words.size()-1).length()) {
					System.out.println("test11");
				}
			}
		}
	
		// 3. 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
}
