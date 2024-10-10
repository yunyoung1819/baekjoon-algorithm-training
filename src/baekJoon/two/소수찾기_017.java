package baekJoon.two;

import java.util.Scanner;

/**
 * 문제 번호 : 1978번
 * 문제 제목 : 소수 찾기
 * 문제 내용 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 입     력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 
 * 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 출    력: 주어진 수들 중 소수의 개수를 출력한다.
 *
 * 수학 개념
 * 소수 : 약수가 1과 자기 자신 밖에 없는 수
 * 소수의 예      : 2, 3, 5, 7, 11...
 * 소수가 아닌 예 : 4, 6, 15, 20....
 * 
 */
public class 소수찾기_017 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;				// 수의 개수 N
		num = scan.nextInt();   
		
		int[] sosu = new int[num];  // N개의 수
		int sosuCount = num; 		// 소수의 개수
		
		for(int i = 0; i < num; i++) {  // 입력받기
			sosu[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			if(sosu[i] == 1){	// 1일 경우 소수 아닌 것에 포함
				sosuCount -= 1;
			}
			for(int j = 2; j < sosu[i]; j++) {  // 자기보다 작은 걸로 나누었을 때
				if(sosu[i] % j == 0) {			// 0으로 나누어떨어지는 것은 소수가 아니니까
					sosuCount -= 1;			// 제외
					break;						// 하나만 나와도 아니니까
				}
			}
		}
		System.out.println(sosuCount);  // 출력하기
	}
}
