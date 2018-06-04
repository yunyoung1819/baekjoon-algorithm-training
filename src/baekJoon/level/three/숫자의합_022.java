package baekJoon.level.three;

import java.util.Scanner;

/**
 * 문제번호 : 11720번
 * 문제제목 : 숫자의 합
 * 문제내용 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
 *
 */
public class 숫자의합_022 {
	public static void main(String[] args) {
		int count = 0;
		String input = "";

		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		input = scan.next();
		scan.close();
		
		int[] number = new int[count];
		int sum = 0;
		
		if(count >= 1 && count <= 100) {
			sum = getSum(count, input, number, sum);
			System.out.println(sum);
		}
	}

	private static int getSum(int count, String input, int[] number, int sum) {
		for(int i = 0; i < count; i++) {
			number[i] = Integer.parseInt(input.substring(i, i+1));
			sum += number[i];
		}
		return sum;
	}
}
