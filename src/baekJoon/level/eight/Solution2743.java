package baekJoon.level.eight;

import java.util.Scanner;

/**
 * 문제번호 : 2743번
 * 문제제목 : 단어길이재기
 * 작 성 일 : 2019.04.14
 * 작 성 자 : yun young 
 * 문제내용 : 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 * 입   력 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 출   력 : 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다. 
 *
 */
public class Solution2743 {
	public static void main(String[] args) {
		Solution2743 solution = new Solution2743();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s.length());
	}
}
