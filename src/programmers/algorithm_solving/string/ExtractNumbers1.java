package programmers.algorithm_solving.string;

import java.util.Scanner;

/**
 * 문제 제목: 9. 숫자만 추출
 * 작 성 자: YUN YOUNG
 * 문제 설명: 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 "tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입    력: 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * 출    력: 첫 줄에 자연수를 출력합니다.
 *
 * 예시 입력1: g0en2T0s8eSoft
 * 예시 출력1: 208
 *
 * Problem Title: 9. Extract Numbers Only
 * By: YOUNG YOUNG
 * Problem Description: Given a string mixed with letters and numbers, only numbers are extracted and natural numbers are created in that order.
 * If you just extract the number from "tge0a1h205er" it's 0,1,2,0,5, and if you make a natural number it's 1205.
 * The natural number produced by extraction does not exceed 100,000,000.
 *
 * Input: The first line is given a string mixed with numbers. String length should not exceed 100.
 * Output: Outputs a natural number on the first line.
 *
 * Example input 1: g0en2T0s8eSoft
 * Example Output 1: 208
 */
public class ExtractNumbers1 {
	private int solution(String input) {
		String str = input.replaceAll("[^0-9]", "");
		return Integer.valueOf(str);
	}

	public static void main(String[] args) {
		ExtractNumbers1 extractNumbers1 = new ExtractNumbers1();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int answer = extractNumbers1.solution(input);
		System.out.println(answer);
		sc.close();
	}
}
