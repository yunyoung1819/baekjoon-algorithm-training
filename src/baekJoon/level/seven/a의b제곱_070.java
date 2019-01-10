package baekJoon.level.seven;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 문제번호 : 10827번
 * 문제제목 : a^b
 * 작 성 일 : 2019.01.11
 * 작 성 자 : yunyoung
 * 문제내용 : 실수 a와 정수 b가 주어졌을 때, a의 b제곱을 정확하게 계산하는 프로그램을 작성하시오.
 * 입   력 : 첫째 줄에 a와 b가 주어진다. (0<a<100, 1<=b<=100) a는 최대 소수점 9자리이며, 소수가 0으로 끝나는 경우는 없다.
 * a는 항상 소수점이 포함되어 있다.
 * 출   력 : a의 b제곱을 출력한다.
 * 
 * 문제풀이 : 실수 A를 정수 B번 제곱한 연산(A^B)의 정확한 값을 출력하는 문제다.
 * java에서 제곱값은 Math 클래스의 pow를 이용하는게 대부분이지만, Math.pow는 근사치를 수행하므로 정확한 값을 구할 수 없다.
 * 실수의 제곱 연산 시 double 타입의 정밀도가 최대 13자리이므로 소수 표현 범위를 초과하여 오차가 발생하기 때문이다.
 * 따라서 java.math.BigDecimal 클래스를 이용해야 한다.
 * 
 * BigDecimal 클래스는 실수 123.456을 다음과 같이 표현한다.
 * private final BigInter value;
 * private final int scale;
 * private transient int precision;
 * 
 * BigDecimal bd = new BigDecimal("123.456");
 * value = 123456
 * scale = 3
 * precision = 6
 *
 */
public class a의b제곱_070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal val = sc.nextBigDecimal(); // 실수 입력
		int scale = sc.nextInt(); 			  // 정수 입력 
		BigDecimal result = val.pow(scale);   // 제곱 연산 수행 

		// BigDecimal 객체의 toPlainString() 메서드를 이용하여 출력해보자.
		// toPlainString() 메서드는 BigDecimal의 지수필드가 없는 문자열 표현을 반환
		System.out.println(result.toPlainString());
		
		sc.close();
	}
}
