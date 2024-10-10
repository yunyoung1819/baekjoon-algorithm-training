package baekJoon.four;

import java.util.Scanner;

/**
 * 문제번호 : 1924번
 * 문제제목 : 2007년
 * 문제내용 : 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까?
 * 이를 알아내는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 빈 칸을 사이에 두고 x(1<=x<=12)와 y(1<=y<=31)이 주어진다.
 * 참고로 2007년에는 1,3,5,7,8,10,12월은 31일까지 4,6,9,11월은 30일까지
 * 2월은 28일까지 있다.
 * 출    력 : 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT 중 하나를 출력한다.
 * 풀이방법 : 배열을 이용하는 방법. 월, 화, 수, 목, 금, 토, 일 총 7개의 요일이 있으므로 7일마다 반복된다.
 * 월과 날짜를 입력받은 후 1월 1일부터 며칠이 흘렀는지를 계산하고 7로 나눈 나머지를 구하면 쉽게 구할 수 있다.
 * 2007년 1월 1일은 월요일부터 시작하기 때문에 switch문에서 case 1번을 월요일부터 시작한다.
 * 해당 월 이전까지의 한달 일수와 해당월의 날짜를 더한 값을 7(일주일)로 나누었을 때
 * 나오는 나머지 값을 이용하여 해당 일의 요일을 알아내었다.
 * 
 * 예를 들어 3월 15일이 문제로 주어졌다면 1월(30) + 2월(28) + 3월(15) = 73
 * 73%7 = 3 따라서 3월 15일은 수요일이다.
 */
public class 이천칠년_032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // 월
		int y = sc.nextInt(); // 일
		
		sc.close();
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 월별 일짜 개수
		int sum = 0;
		
		for(int i = 0; i < x - 1; i++) {
			sum += month[i];
		}
		sum += y;
		
		if(x >= 1 && x <= 12 && y >= 1 && y <= 31) {
			getDays(sum);
		}
		
	}

	private static void getDays(int sum) {
		switch(sum % 7){
		case 0 : 
			System.out.println("SUN");
			break;
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
		}
	}
}
