package baekJoon.three;

import java.util.Scanner;

/**
 * 문제 번호 : 10809번
 * 문제 제목 : 알파벳 찾기
 * 문제 내용 : 알파벳 소문자로만 이루어진 단어 S가 주어진다.
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 * 포함되어 있지 않는 경우에는 -1을 출력하는 프록그램을 작성하시오.
 * 입     력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며
 * 알파벳 소문자로만 이루어져 있다.
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... 
 * z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 
 * 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다
 *
 */
public class 알파벳찾기_029 {
	public static void main(String[] args) {
		String words = "";
		
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
				"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", 
				"u", "v", "w", "x", "y", "z"};
		
		Scanner input = new Scanner(System.in);
		words = input.nextLine();
		words = words.toLowerCase();
		
		for(int i = 0; i <= alphabet.length - 1; i++) {
			//System.out.println(alphabet[i]);
			System.out.print(words.indexOf(alphabet[i]));
			System.out.print(" ");
		}
	}
}
