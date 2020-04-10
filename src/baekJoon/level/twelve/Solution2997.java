package baekJoon.level.twelve;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 : 2997번 
 * 문제제목 : 네 번째 수  
 * 문제링크 : https://www.acmicpc.net/problem/2997
 * 작 성 일 : 2020.04.10
 * 작 성 자 : YUN YOUNG
 * 문제내용 : 상근이는 등차수열을 이루는 정수 4개를 골랐다. 이것은 상근이가 고른 수 4개를 정렬했을 때, 인접한 쌍의 차이가 일정하다는 것을 의미한다.
 * 그 다음 이렇게 고른 숫자 4개를 노래로 만들어서 외우고 다닌다. 
 * 어느 날, 상근이는 자신이 고른 4개 숫자 중 1개를 까먹었다.
 * 상근이가 고른 네 개의 숫자 중 세 개가 주어졌을 때, 네 번째 숫자를 구하는 프로그램을 작성하시오.
 * 
 * 입   력 : 첫째 줄에 상근이가 고른 네 개의 숫자 중 세 개가 주어진다. 이 숫자는 크기 순이 아닐 수도 있고, -100보다 크거나 같고, 
 * 100보다 작거나 같은 정수이다.
 * 출   력 : 첫째 줄에 네 번째 숫자를 출력한다. 정답이 여러 개일 경우에는 아무거나 출력하면 된다. 
 * 또한 정답이 존재하지 않는 경우는 입력으로 주어지지 않는다.
 *
 */
public class Solution2997 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		// 입력받은 3개의 수를 배열에 저장 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 배열을 오름차순으로 정렬 
		Arrays.sort(arr);		
		System.out.println(getAnswer(arr));
	
		sc.close();
	}

	private static int getAnswer(int[] arr) {
		// 차가 가장 적은 수를 공차(등차)로 구함 
		int equalDifference = Math.min(arr[2]-arr[1], arr[1]-arr[0]);
		int answer = 0;
		
		if (arr[2]-arr[1] != equalDifference) {
			answer = arr[1] + equalDifference;
		} else if (arr[1]-arr[0] != equalDifference) {
			answer = arr[0] + equalDifference;
		} else {
			answer = arr[0] - equalDifference;
		}
		
		return answer;
	}
}
