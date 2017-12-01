package BaekJoon_Level1;

import java.util.*;
/**
 * 문제번호 : 1000번
 * 문제 제목 : A+B
 * 문제 : 두 수를 입력받고 합을 출력하는 문제
 * @since : 2017.12.02
 * @author Yun Young
 *
 */
public class APlusB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = A+B;
		System.out.print(C);
	}
}
