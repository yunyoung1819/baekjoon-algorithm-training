package baekJoon.two;

import java.util.Scanner;

/**
 * 문제번호 : 10039번
 * 문제제목 : 평균 점수
 * 
 * 문제내용 : 상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.

 * 어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다.
 * 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 
 * 하지만 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게된다.
 * 보충학습은 거부할 수 없기 때문에 40점 미만인 학생들은 항상 40점을 받게된다.
 * 학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
 * 
 * 입력 : 입력은 총5줄로 이루어져 있고 원섭이의 점수, 세희의 점수, 
 * 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.
 * 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서 평균 점수는 항상 정수이다.
 * 
 * 출력 : 첫째 줄에 학생 5명의 평균 점수를 출력한다.
 *
 */
public class 평균점수_011 {
	public static void main(String[] args) {
		
		int sum = 0;
		int average = 0;
		int score[] = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			sum = getExamScoreSum(sum, score, input, i);
		}
		
		//평균 점수 구하기
		average = sum/score.length;
		
		//평균 점수 출력
		System.out.println(average);
		
	}

	private static int getExamScoreSum(int sum, int[] score, Scanner input, int i) {
		int examScore = input.nextInt();
		
		if(examScore % 5 == 0){
			if(examScore < 40){ // 점수가 40점 미만일 때
				score[i] = 40;
			}else{				// 점수가 40점 이상일 때
				score[i] = examScore;
			}
		}else{
			System.out.println("시험 점수는 5의 배수이어야 합니다.");
		}
		
		sum += score[i];
		
		return sum;
	}
}