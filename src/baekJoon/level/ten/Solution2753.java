package baekJoon.level.ten;

import java.util.Scanner;

/**
 * 문제번호 : 2753번
 * 문제제목 : 윤년
 * 작 성 일 : 2019.09.08
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
 * 예를들어, 2012년은 4의 배수라서 윤년이지만, 1900년은 4의 배수이지만, 100의 배수이기 때문에 윤년이 아니다.
 * 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
 * 
 * 입     력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
 * 출     력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 *
 */
public class Solution2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		Solution2753 solution = new Solution2753();
		System.out.println(solution.getLeapYear(year));
		
		sc.close();
	}

	public int getLeapYear(int year) {
		
		int isLeapYear = 0;
		
		if (year % 4 == 0 && year % 100 != 0) {
			isLeapYear = 1;
		} else if (year % 400 == 0) {
			isLeapYear = 1;
		} 
		
		return isLeapYear;
	}
}
