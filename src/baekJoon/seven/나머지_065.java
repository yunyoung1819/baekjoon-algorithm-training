package baekJoon.seven;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 문제번호 : 3052번
 * 문제제목 : 나머지 
 * 작 성 자 : Ryan Yun
 * 문제내용 : 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지이다. 
 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2 이다.
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
 * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 * 입  력 : 첫째 줄부터 열번째 줄까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * 출  력 : 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다. 
 *
 */
public class 나머지_065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		HashSet<Integer> numbers = new HashSet<Integer>();	// 10개의 숫자를 저장할 Set 선언. Set은 중복을 허용하지 않음 
		
		for(int i = 0; i < 10; i++) {
			input = sc.nextInt();
			if(input > 1000 || input < 0) {
				input = sc.nextInt();
				break;
			}else{
				input = input % 42;
				numbers.add(input);
			}
		}
		
		System.out.println(numbers.size());
		sc.close();
	}
}
