package baekJoon.four;

import java.util.*;

/**
 * 문제번호 : 10950번
 * 문제제목 : A + B -3
 * 작 성 자 : Yun Young
 * 문제내용 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0<A, B<10)
 * 출    력 : 각 테스트 케이스마다 A+B를 출력한다.
 * 풀이방법 : 테스트 케이스 형식으로 주어지는 경우에는 각각을 독립적인 문제로 생각하고 풀면 된다.
 * 전체 테스트 케이스를 입력받은 다음에 풀지 않아도 된다. 아래 코드처럼 하나 하나 입력받고
 * 풀면 된다. 
 *
 */
public class APlusB03_039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, a, b = 0;
		t = sc.nextInt();
		
		while (t-- > 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
	}
}
