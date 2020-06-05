package baekJoon.level.thirteen;

import java.util.Scanner;

/**
 * 
 * 문제번호 : 5543번 
 * 문제제목 : 상근날드 
 * 문제링크 : https://www.acmicpc.net/problem/5543
 * 작 성 일 : 2020.06.05
 * 작 성 자 : YUN YOUNG 
 * 문제내용 : 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라 세트로 구매하면
 * 가격의 합계에서 50원을 뺸 가격이 세트 메뉴의 가격이 된다.
 * 햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고 음료는 콜라와 사이다 두 종류가 있다.
 * 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
 * 
 * 입   력 : 입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다.
 * 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.
 * 
 * 출  력 : 첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.
 *
 */
public class Solution5543 {
	
	public static int hamburgerCount = 3;
	public static int drinkCount = 2;
	public static int discount = 50;
	public static int[] hamburgerPrice = new int[hamburgerCount];
	public static int[] drinkPrice = new int[drinkCount];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		setHamburgerPrice(sc);
		setDrinkPrice(sc);
		
		Solution5543 solution = new Solution5543();
		System.out.println(solution.getSetPrice());
		sc.close();
	}
	
	private static void setHamburgerPrice(Scanner sc) {
		for (int i = 0; i < hamburgerCount; i++) {
			hamburgerPrice[i] = sc.nextInt();
		}
	}

	private static void setDrinkPrice(Scanner sc) {
		for (int j = 0; j < drinkCount; j++) {
			drinkPrice[j] = sc.nextInt();
		}
	}
	
	private int getSetPrice() {
		int hamburgerMinPrice = Integer.MAX_VALUE;
		int drinkMinPrice = Integer.MAX_VALUE;
		
		hamburgerMinPrice = getHamberMinPrice(hamburgerMinPrice);
		drinkMinPrice = getDrinkMinPrice(drinkMinPrice);
		
		return (hamburgerMinPrice + drinkMinPrice) - discount;
	}
	
	private int getHamberMinPrice(int hamburgerMinPrice) {
		for (int i = 0; i < hamburgerCount; i++) {
			if (hamburgerMinPrice > hamburgerPrice[i]) {
				hamburgerMinPrice = hamburgerPrice[i];
			}
		}
		return hamburgerMinPrice;
	}

	private int getDrinkMinPrice(int drinkMinPrice) {
		for (int j = 0; j < drinkCount; j++) {
			if (drinkMinPrice > drinkPrice[j]) {
				drinkMinPrice = drinkPrice[j];
			}
		}
		return drinkMinPrice;
	}
}
