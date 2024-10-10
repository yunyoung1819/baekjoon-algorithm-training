package baekJoon.two;

import java.util.Scanner;

/**
 * 문제번호 : 10998번
 * 문제제목 : A X B
 * 문제내용 : 두 정수 A와 B를 입력받은 다음, AxB를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다. (O < A, B < 10)
 * 출력 : 첫째 줄에 A x B를 출력한다.
 * 
 */
public class AMulB_015 {
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		
		while(true){
			a = input.nextInt();
			b = input.nextInt();
			
			try {
				if(a > 0 && b < 10) {
					System.out.println(a * b);
				}
			} catch(Exception e) {
				System.out.println("입력오류");
				continue;
			}
			break;
		}
		
	}
}
