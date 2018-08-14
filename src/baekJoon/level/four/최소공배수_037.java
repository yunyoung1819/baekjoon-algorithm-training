package baekJoon.level.four;

import java.util.Scanner;

/**
 * 문제번호 : 1934번
 * 문제제목 : 최소공배수
 * 작 성 자 : Yun Young
 * 문제내용 : 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
 * 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어 6과 15의 공배수는 30, 60, 90 등이 있으며
 * 최소공배수는 30이다.
 * 
 * 두 자연수 A와 B가 주어졌을 때 A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
 * 
 * 입    력 : 첫째 줄에 테스트 케이스의 개수 T(1<=T<= 1000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1<=A,B<=45,000)
 * 출    력 : 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
 *
 * 문제풀이 : 유클리드 호제법을 이용하여 a와 b의 최소공배수. if(a<b)면 서로 교체(val1이 큰 값, val2가 작은 값) 
 * r이 0이 될때까지 r = val1 % val2
 * val1 = val2
 * val2 = r;
 
 * LCM = (a * b) / val1
 * 
 */
public class 최소공배수_037 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a, b, lcm = 0;
		int r, val1, val2;
		
		if(t < 1 || t > 1000) {
			t = sc.nextInt();
		}
		
		for(int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a < b) {  	// if(a<b)이면 서로 교체(val1이 큰 값, val2가 작은 값)
				val1 = b;
				val2 = a;
			}else {
				val1 = a;
				val2 = b;
			}
			
			do {
				r = val1 % val2;
				val1 = val2;
				val2 = r;
			} while (r>0);
			
			lcm = a * b / val1;
			
			System.out.println(lcm);
		}
	}
}
