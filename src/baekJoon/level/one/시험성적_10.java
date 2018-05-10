package baekJoon.level.one;

import java.util.Scanner;

/**
 * 시험 성적
 * 
 * 문제번호 : 9498번
 * 문제내용 : 시험 점수를 입력받아 90 ~ 100 점은 A, 80 ~ 89점은 B, 
 * 70 ~ 79점은 C, 60 ~ 69점은 D, 
 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오
 * 입력 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고 100보다 작거나 같은 자연수이다.
 * 출력 : 시험 성적을 출력한다.
 */
public class 시험성적_10 {
	public static void main(String[] args) {
		
		int score = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		if(score >= 0 && score <= 100){
			if(score >= 90 && score <= 100){
				System.out.println("A");
			}else if(score >= 80 && score <= 89){
				System.out.println("B");
			}else if(score >= 70 && score <= 79){
				System.out.println("C");
			}else if(score >= 60 && score <= 69){
				System.out.println("D");
			}else{
				System.out.println("F");
			}
		}
	}
}
