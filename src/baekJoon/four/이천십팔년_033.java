package baekJoon.four;

import java.util.Scanner;

/**
 * 문제번호 : 셀프추가
 * 문제제목 : 2018년
 * 문제내용 : 오늘은 2018년 1월 1일 월요일이다. 그렇다면 2018년 x월 y일은 무슨 요일일까?
 * 이를 알아내는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 
 * 11월은 30일까지, 2월은 28일까지 있다.
 * 출     력 : 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 *
 */
public class 이천십팔년_033 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		
		for(int i = 0; i < m - 1; i++) {
			sum += month[i];
		}
		d += sum;
		
		getDays(d);
	}

	private static void getDays(int d) {
		switch(d % 7) {
		case 1 :
			System.out.println("MON");
			break;
		case 2 :
			System.out.println("TUE");
			break;
		case 3 :
			System.out.println("WED");
			break;
		case 4 :
			System.out.println("THU");
			break;	
		case 5 :
			System.out.println("FRI");
			break;
		case 6 :
			System.out.println("SAT");
			break;
		case 7 :
			System.out.println("SUN");
			break;
		}
	}
}
