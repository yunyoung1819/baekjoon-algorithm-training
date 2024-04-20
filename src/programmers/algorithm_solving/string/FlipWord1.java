package programmers.algorithm_solving.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제 제목: 4. 단어 뒤집기
 * 문제 설명: N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 입    력: 첫 줄에 자연수 N(3<= N <=20)이 주어집니다. 두번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다.
 * 단어는 영어 알파벳으로만 구성되어 있습니다.
 * 출    력: N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class FlipWord1 {
	private void solution(String[] wordsArr) {
		List<String> answers = new ArrayList<>();

		for (String word : wordsArr) {
			String flipWord = "";
			char[] arr = word.toCharArray();
			for (int i = arr.length - 1; i >= 0; i--) {
				flipWord += Character.toString(arr[i]);
			}
			answers.add(flipWord);
		}

		for (String answer : answers) {
			System.out.println(answer);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] wordsArr = new String[n];

		for (int i = 0; i < n; i++) {
			String input = sc.next();
			wordsArr[i] = input;
		}

		FlipWord1 flipWord = new FlipWord1();
		flipWord.solution(wordsArr);

		sc.close();
	}
}
