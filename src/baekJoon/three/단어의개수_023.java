package baekJoon.three;

import java.util.Scanner;

/**
 * 문제번호 : 1152번
 * 문제제목 : 단어의 개수
 * 문제내용 : 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다.
 * 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 입 력 : 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 이 문장의 길이는 1,000,000을 넘지 않는다.
 * 단어는 띄어쓰기 한 개로 구분되며 공백이 연속해서 나오는 경우는 없다.
 * 출 력 : 첫째 줄에 단어의 개수를 출력한다. 
 *
 */
public class 단어의개수_023 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().trim(); // 공백을 제거하고 문장 입력받기
		String[] words = input.split(" ");     // 문장을 공백으로 구분하여 String 배열에 담기
		
		if(input.isEmpty()) {
			System.out.println(0);
		}else{
			System.out.println(words.length);
		}
	}
}
