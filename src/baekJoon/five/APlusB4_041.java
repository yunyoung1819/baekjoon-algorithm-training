package baekJoon.five;

import java.util.Scanner;

/**
 * 문제번호 : 10951번
 * 문제제목 : A + B - 4
 * 작 성 자 : Yun Young
 * 문제내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입    력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며 각 줄에 A와 B가 주어진다. (0<A, B<10)
 * 출    력 : 각 테스트 케이스마다 A+B를 출력한다.  
 * 풀이방법 : 이 문제처럼 입력이 몇 개인지 주어지지 않는 경우에는 입력을 EOF까지 받으면 된다.
 * Java : While (sc.hasNextInt())
 *
 */
public class APlusB4_041 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
		sc.close();
	}
}
