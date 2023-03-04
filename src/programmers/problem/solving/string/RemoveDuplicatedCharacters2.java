package programmers.problem.solving.string;

import java.util.Scanner;

public class RemoveDuplicatedCharacters2 {
	private void solution(String str) {
		String answer = "";
		for (int i=0; i < str.length(); i++) {
//			System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		System.out.print(answer);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		RemoveDuplicatedCharacters2 removeDuplicatedCharacters2 = new RemoveDuplicatedCharacters2();
		removeDuplicatedCharacters2.solution(input);
		sc.close();
	}
}
