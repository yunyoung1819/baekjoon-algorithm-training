package baekJoon.level.twelve;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 문제번호 : 10825번 
 * 문제제목 : 국영수 
 * 문제링크 : https://www.acmicpc.net/problem/10825
 * 작 성 일 : 2020.04.19
 * 작 성 자 : yun young
 * 
 * 문제내용 : 도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다. 이때, 다음과 같은 조건으로 학생의 성적을 정렬하는 프로그램을 작성하시오.4
 * 1. 국어 점수가 감소하는 순서로
 * 2. 국어 점수가 같으면 영어 점수가 증가하는 순서로
 * 3. 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
 * 4. 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
 * 
 * 입     력 : 첫째 줄에 도현이네 반의 학생의 수 N(1<=N<=10,000)이 주어진다. 둘째 줄부터 한 줄에 하나씩 각 학생의 이름, 국어, 영어, 수학 점수가
 * 공백으로 구분해 주어진다. 점수는 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 * 이름은 알파벳 대소문자로 이루어진 문자열이고, 길이는 10자리를 넘지 않는다.
 * 
 * 출     력 : 문제에 나와있는 정렬 기준으로 정렬한 후 첫째 줄부터 N개의 줄에 걸쳐 각 학생의 이름을 출력한다.
 */
public class Solution10825 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] students = new String[N][4];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				students[i][j] = sc.next();
			}
		}
		
		Arrays.sort(students, new Comparator<String[]>() {
			@Override
			public int compare(String[] student1, String[] student2) {
				if (Integer.parseInt(student1[1]) == Integer.parseInt(student2[1])) {
					if (Integer.parseInt(student1[2]) == Integer.parseInt(student2[2])) {
						if (Integer.parseInt(student1[3]) == Integer.parseInt(student2[3])) {
							// 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로
							return student1[0].compareTo(student2[0]);
						}
						//국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로 
						return Integer.compare(Integer.parseInt(student2[3]), Integer.parseInt(student1[3]));
					}
					// 국어 점수가 같으면 영어 점수가 증가하는 순서로 
					return Integer.compare(Integer.parseInt(student1[2]), Integer.parseInt(student2[2]));
				}
				// 국어 점수가 감소하는 순서로 
				return Integer.compare(Integer.parseInt(student2[1]), Integer.parseInt(student1[1]));
			}
		});
		for (int i = 0; i < N; i++) {
			System.out.println(students[i][0]);
		}
		sc.close();
	}
}
