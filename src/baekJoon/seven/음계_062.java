package baekJoon.seven;

import java.util.Scanner;

/**
 * 문제번호 : 2920번
 * 문제제목 : 음계
 * 작 성 자 : Ryan Yun
 * 문제내용 : 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 
 * 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed 인지 판별하는 프로그램을 작성하시오.
 * 
 * 입  력 : 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한번씩 등장한다.
 * 출  력 : 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
 * 
 * 풀  이 : 크기가 8인 int형 배열을 선언하여 입력받는다. 
 * 그리고 0부터 6까지 for문으로 반복하면서 현재 인덱스와 다음 인덱스 값과의 차를 구한다.
 * 단 한번이라도 두 값의 차이가 -1 이나 1 이 아니면 ascending이거나 descending일 수 없으므로
 * mixed 로 저장한 후 break문으로 반복문을 탈출한다.  
 * 
 */
public class 음계_062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sounds = new int[8];  // 0~7
		String result = "";
		
		for(int i = 0; i < sounds.length; i++) {
			sounds[i] = sc.nextInt();
		}
		sc.close();
		
		for(int j = 0; j < sounds.length - 1; j++) {
			if(sounds[j] == sounds[j+1]-1) {
				result = "ascending";
			}else if(sounds[j] == sounds[j+1]+1) {
				result = "descending";
			}else {
				result = "mixed";
				break;
			}
		}
        
		System.out.println(result);
		sc.close();
	}
}
