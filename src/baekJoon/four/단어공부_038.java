package baekJoon.four;

import java.util.Scanner;

/**
* 문제번호 : 1157번
* 문제제목 : 단어 공부
* 작 성 자 : Yun Young
* 문제내용 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
* 단 대문자와 소문자를 구분하지 않는다.
* 입    력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
* 출    력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
* 풀이방법 : for i = 0 부터 word의 길이까지 현재 알파벳 위치의 카운트 배열에 +1을 더한다.
* if 현재 알파벳 카운트가 max보다 크면 answer = 현재 알파벳, max = 현재 알파벳의 카운트 수
* else if 현재 알파벳 카운트가 max와 같다면 answer = '?' 
* 위 과정을 문자열의 길이만큼 반복한다.
*/
public class 단어공부_038 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] count = new int[26]; 				
		int max = 0;             				
		char answer = '?'; 		 				
		String word = input.next().toUpperCase();  
		
		for(int i = 0; i < word.length(); i++) {          // for i = 0 부터 word의 길이까지
			count[word.charAt(i)-'A']++;                  // 현재 알파벳 위치의 카운트 배열에 +1
			if(max < count[word.charAt(i)-'A']) {         // if 현재 알파벳 카운트가 max보다 크다면
				answer = word.charAt(i);                  // answer = 현재 알파벳 
				max = count[word.charAt(i)-'A'];          // max = 현재 알파벳의 카운트 수
			}else if(max == count[word.charAt(i)-'A']) {  // else if 현재 알파벳 카운트가 max와 같다면
				answer = '?';           				  // answer = '?'
			}                                             // 위 과정을 문자열의 길이만큼 반복한다.
		}
		System.out.println(answer);
	}	
}
