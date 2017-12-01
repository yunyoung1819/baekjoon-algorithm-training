package BaekJoon_Level1;

import java.util.Scanner;

/**
 * 백준 알고리즘 문제 1001번
 * 두 수를 입력받고 뺼샘을 한 결과를 출력하는 문제
 * 
 * @since : 2017.12.02
 * @author : Yun Young
 *
 */
public class AminusB {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = A-B;
		
		System.out.print(C);
		
	}
	
	
	
}
