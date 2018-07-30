package baekJoon.level.four;

import java.util.Scanner;

/**
 * 문제번호 : 10871번
 * 문제제목 : X보다 작은 수
 * 문제내용 : 정수 N 개로 이루어진 수열 A 와 정수 X 가 주어진다. 
 * 이 때 A 에서 X 보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 
 * 입    력 : 첫째 줄에 N 과 X 가 주어진다. (1 <= N, X <= 10,000)
 * 둘째 줄에 수열 A 를 이루는 정수 N 개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000 보다 작거나 같은 정수이다.
 * 
 * 출    력 : X 보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */
public class X보다작은수_035 {
	public static void main(String[] args) {
		// 첫째 줄에 N과 X가 주어진다.
		Scanner input = new Scanner(System.in);
		int n, x = 0;
		n = input.nextInt();
		x = input.nextInt();
	
		// 1 <= N, X <= 10000
		if(n < 1 || x > 10000) {
			n = input.nextInt();
			x = input.nextInt();
		}

		// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
		int[] a = new int[n];
		
		for(int i = 0; i <= n - 1; i++) {
			a[i] = input.nextInt();
			// 주어지는 정수는 모두 1보다 크거나 같고 10,000 보다 작거나 같은 정수이다. 	
			if(a[i] < 1 || a[i] > 10000) {
				a[i] = input.nextInt();
			}else if(a[i] < x) {
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
		input.close();
	}
}
