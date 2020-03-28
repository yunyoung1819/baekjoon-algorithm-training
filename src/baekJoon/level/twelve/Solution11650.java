package baekJoon.level.twelve;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 문제번호 : 11650번 
 * 문제제목 : 좌표 정렬하기 
 * 문제링크 : https://www.acmicpc.net/problem/11650
 * 작 성 일 : 2020.03.27
 * 작 성 자 : YUN YOUNG 
 * 문제내용 : 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 점의 개수 N(1<=N<=100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 Xi와 Yi가 주어진다.(-100,000<Xi, Yi<=100,000)
 * 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 * 
 * 출   력 : 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다. 
 *
 */
public class Solution11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[][] point = new int[count][2];
		
		for (int i = 0; i < count; i++) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}
		
		Arrays.sort(point, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if (o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				} 
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		for (int i = 0; i < count; i++) {	
			System.out.println(point[i][0] + " " + point[i][1]);
		}
		
		sc.close();
	}
}
