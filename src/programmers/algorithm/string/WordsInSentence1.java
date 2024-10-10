package programmers.algorithm.string;

import java.util.Scanner;

/**
 * 문제 제목: 3. 문장 속 단어
 * 문제 설명: 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장 속의 각 단어는 공백으로 구분됩니다.
 * 
 * 입   력: 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 출   력: 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 정답으로 합니다. 
 */
public class WordsInSentence1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		System.out.println(solution(input));
		scanner.close();
	}
	
	private static String solution(String sentence) {
		String[] wordsArr = sentence.split(" ");
		String answer = "";
		
		for (int i = 0; i <= wordsArr.length - 1; i++) {
			if (answer.length() < wordsArr[i].length()) {
				answer = wordsArr[i];
			}
		}
		return answer;
	}
}
