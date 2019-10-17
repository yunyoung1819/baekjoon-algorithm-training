package baekJoon.level.ten;

/**
 * 문제번호 : 4673번 
 * 문제제목 : 셀프 넘버 
 * 문제링크 : https://www.acmicpc.net/problem/4673
 * 작 성 일 : 2019.10.17
 * 작 성 자 : YUN YOUNG
 * 
 * 문제내용 : 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 
 * n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
 * 양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ... 과 같은 무한 수열을 만들 수 있다.
 * 예를 들어, 33으로 시작한다면 다음 수는 33+3+3 = 39이고, 그 다음 수는 39+3+9=51, 다음 수는 51+5+1 = 57이다.
 * 이런 식으로 다음과 같은 수열을 만들 수 있다.
 * 33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
 * n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다.
 * 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개 (91과 100) 있다.
 * 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다.
 * 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
 * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * 입   력 : 입력은 없다.
 * 출   력 : 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다. 
 *
 * 풀이방법  
 * 1) n으로 d(n)을 찾는 함수(getDn)을 만들고, n을 1부터 10000까지 반복
 * 2) 크키가 10001인 배열을 만들고 d(n)이 되는 숫자가 셀프 넘버가 아니라고 체크
 * 3) 반복을 마친 후 배열에 체크되지 않은 셀프 넘버를 출력 
 */
public class Solution4673 {
	
	private static boolean[] isNotSelfNumber = new boolean[10001];
	
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			getDn(i);
		}
		
		for (int i = 1; i < 10000; i++) {
			if (!isNotSelfNumber[i]) {
				System.out.println(i);
			}
		}
	}

	private static int getDn(int n) {
		int dn = 0;
		
		if (n < 10) {	// 1의 자리 
			dn = 2 * n;
			isNotSelfNumber[dn] = true;
		} else if (n >= 10 && n < 100) {	// 10의 자리 
			int[] digit = new int[2];	// 33
			digit[0] = n / 10;  // 3
			digit[1] = n % 10;  // 3
			dn = n + digit[0] + digit[1]; // 33+3+3 = 39
			isNotSelfNumber[dn] = true;
		} else if (n >= 100 && n < 1000) {	// 100의 자리 
			int[] digit = new int[3];  // 222
			digit[0] = n / 100; // 2
			digit[1] = (n % 100) / 10;  // 2
			digit[2] = n % 10;  // 2
			dn = n + digit[0] + digit[1] + digit[2]; // 222+2+2+2=258
			isNotSelfNumber[dn] = true;
		} else if (n >= 1000 && n < 10000) { // 1000의 자리 
			int[] digit = new int[4]; // 9913
			digit[0] = n / 1000;	// 9
			digit[1] = (n % 1000) / 100;	// 9
			digit[2] = (n % 100) / 10;	// 1
			digit[3] = n % 10;	// 3
			dn = n + digit[0] + digit[1] + digit[2] + digit[3]; // 9913+9+9+1+3 = 9935
			
			if (dn >= 10000) {
				return 0;
			}
			isNotSelfNumber[dn] = true;
		} else {
			return 0;
		}
		return getDn(dn);
	}
}
