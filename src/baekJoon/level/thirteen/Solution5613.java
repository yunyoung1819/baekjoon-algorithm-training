package baekJoon.level.thirteen;

import java.util.Scanner;

/**
 * 
 * 문제번호 : 5613번
 * 문제제목 : 계산기 프로그램 
 * 문제링크 : https://www.acmicpc.net/problem/5613
 * 작 성 일 : 2020.06.09
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 덧셈, 뺄셈, 곱셉, 나눗셈을 할 수 있는 계산기 프로그램을 만드시오.
 * 
 * 입   력 : 입력의 각 줄에는 숫자와 +,-,*,/,= 중 하나가 교대로 주어진다. 첫 번째 줄은 수이다. 
 * 연산자의 우선순위는 생각하지 않으며, 입력 순서대로 계산을 하고, =가 주어지면, 그때까지의 결과를 출력한다.
 * 주어지는 수는 10^8 이하의 양의 정수이다. 계산 중 결과는 0 또는 음수가 될 수 있지만, -10^8 ~ 10^8 범위를 넘지는 않는다.
 * 또, 나눗셈에서 소수점은 버린다. 따라서, 100/3*3=99 이다.
 * 피제수가 음수일 때 나눗셈을 하는 경우는 입력으로 주어지지 않는다.
 * 
 * 출   력 : 첫째 줄에 계산 결과를 출력한다.
 *
 */
public class Solution5613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String operator = sc.next();
		int num2 = sc.nextInt();
		String equals = sc.next();
		
		Solution5613 solution = new Solution5613();
		System.out.println(solution.calculator(num1, operator, num2, equals));
		sc.close();
	}

	private int calculator(int num1, String operator, int num2, String equals) {
		int result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
		default:
			break;
		}
		return result;
	}
}
