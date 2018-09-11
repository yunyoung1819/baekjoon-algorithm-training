package baekJoon.level.six;

import java.util.Scanner;

/**
 * 문제번호 : 2609번
 * 문제제목 : 최대공약수와 최소공배수
 * 작 성 자 : Yun Young
 * 문제내용 : 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000 이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 * 출    력 : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소공배수를 출력한다.
 */
public class 최대공약수와최소공배수_053 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();	// 자연수 a
		int b = input.nextInt();    // 자연수 b
		int g = gcd(a,b);			// 최대공약수 g
		int l = a * b / g;			// 최소공배수 l
		
		System.out.println(g);
		System.out.println(l);
		
		input.close();
	}
	
	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x%y);
		}
	}
}
