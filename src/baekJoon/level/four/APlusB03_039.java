package baekJoon.level.four;

import java.util.Scanner;

/**
 * 문제번호 : 10950번
 * 문제제목 : A + B - 3
 * 작 성 자 : Yun Young
 * 문제내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출    력 : 각 테스트 케이스마다 A+B를 출력한다. 
 *
 */
public class APlusB03_039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		
		for (int i = 0; i <= t; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int j = 0; j <= t; j++) {
			System.out.print(a[j]+b[j]);
		}
		sc.close();
	}
}
