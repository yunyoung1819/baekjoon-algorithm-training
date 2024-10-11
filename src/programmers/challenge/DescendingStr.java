package programmers.challenge;

import java.util.Arrays;

/**
 * 문제제목 : 문자열 내림차순으로 배치하기
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12917
 * 작 성 일 : 2019.05.18
 * 작 성 자 : yunyoung
 * 
 * 문제설명 : 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수,
 * solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * 
 * 제한사항 : str은 길이  이상인 문자열입니다.
 * 입출력예 
 * s: "Zbcdefg" return : "gfedcbZ"
 */
public class DescendingStr {
	public static void main(String[] args) {
		// DescendingStr descStr = new DescendingStr();
		// String s = "AbCdKkdfg";
		// System.out.println(descStr.descendingStr(s));
	}

	String descendingStr(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);	// 작은 부터 큰 것 순으로 오름차순 정렬 
		return new StringBuilder(new String(arr)).reverse().toString();	// 오름차순 정렬된 arr를 reverse 한다.
	}
	
}
