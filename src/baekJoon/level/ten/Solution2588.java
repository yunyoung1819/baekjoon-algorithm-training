package baekJoon.level.ten;

import java.util.Scanner;

/**
 * 문제번호 : 2588번 
 * 문제제목 : 곱셉 
 * 문제링크 : https://www.acmicpc.net/problem/2588
 * 작 성 일 : 2019.10.18
 * 작 성 자 : YUN YOUNG
 * 문제내용 : (세 자리 수) x (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *       
 *       4 7 2 -------- (1)
 *     x 3 8 5 -------- (2)
 *   ____________
 *     2 3 6 0 -------- (3)
 *   3 7 7 6   -------- (4)
 * 1 4 1 6     -------- (5)
 * _______________
 * 1 8 1 7 2 0 -------- (6)
 * 
 * (1)과 (2) 위치에 들어갈 세 자리 자연수가 주어질  (3),(4),(5),(6) 위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 출   력 : 첫째 줄부터 넷째 줄까지 차례대로 (3),(4),(5),(6)에 들어갈 값을 출력한다. 
 * 
 */
public class Solution2588 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		Solution2588 solution = new Solution2588();
		solution.printAnswer(firstNumber, secondNumber);
		
		sc.close();
	}

	private void printAnswer(int number1, int number2) {
		System.out.println(number1 * (number2 % 10));
		System.out.println(number1 * ((number2 % 100) / 10));
		System.out.println(number1 * (number2 / 100));	
		System.out.println(number1 * number2);	
	}
}
