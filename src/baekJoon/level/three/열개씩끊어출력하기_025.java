package baekJoon.level.three;

import java.util.Scanner;

/**
 * 문제번호 : 11721번
 * 문제제목 : 열 개씩 끊어 출력하기
 * 작 성 자 : Yun Young
 * 문제내용 : 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 
 * 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
 * 출    력 : 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 
 * 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자를 출력할 수도 있다.
 */
public class 열개씩끊어출력하기_025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();   			    // 입력받은 스트링 문자
		
		if(word.length() > 100) {
			word = sc.nextLine();
		}
		
		char[] arr = new char[word.length()];  		// 스트링을 담을 배열 
		
		for (int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(i);				// 스트링을 한 글자씩 끊어 배열에 저장
			
			if(i != 0 && i % 10 == 0) {
				System.out.println("");
			}
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
