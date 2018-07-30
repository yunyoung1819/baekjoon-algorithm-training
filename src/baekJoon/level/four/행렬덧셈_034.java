package baekJoon.level.four;

import java.util.Scanner;

/**
 * 문제번호 : 2738번
 * 문제제목 : 행렬덧셈
 * 문제내용 : N*M 크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 * 입    력 : 첫째 줄에 행렬의 크기 N 과 M 이 주어진다. 둘째줄부터 N개의 줄에 행렬 A의 원소 M 개가 차례대로 주어진다.
 * 이어서 N 개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고 행렬의 원소는 절대값이 
 * 100보다 작거나 같은 정수이다.
 * 출    력 : 첫째줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 *
 */
public class 행렬덧셈_034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] sumMatrix = new int[n][m];
		
		getMatrix(sc, n, m, a, b);
		getSumMatrix(a, b, sumMatrix);
		printResult(sumMatrix);
		
		sc.close();
	}

	private static void getMatrix(Scanner sc, int n, int m, int[][] a, int[][] b) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int k = 0; k < n; k++) {
			for(int l = 0; l < m; l++) {
				b[k][l] = sc.nextInt();
			}
		}
	}

	private static void getSumMatrix(int[][] a, int[][] b, int[][] sumMatrix) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				sumMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
	}

	private static void printResult(int[][] sumMatrix) {
		for(int[] sum : sumMatrix) {
			for(int s : sum) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
