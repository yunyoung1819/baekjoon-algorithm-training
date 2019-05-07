package baekJoon.level.nine;

import java.util.Scanner;

/**
 * 문제번호 : 11726번
 * 문제제목 : 2xn 타일링
 * 문제링크 : https://www.acmicpc.net/problem/11726
 * 작 성 일 : 2019.05.07
 * 작 성 자 : yun young
 * 문제설명 : 2xn 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그름은 2x5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 * 입   력 : 첫째 줄에 n이 주어진다. (1 <= n <= 1,000)
 * 출   력 : 첫째 줄에 2xn 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다. 
 * 
 * 풀이방법 
 * 1. D[N] 에 어떤 값을 저장할 것인지 문장으로 정의해줘야 한다. 
 * D[N] = "2xN 직사각형을 채우는 모든 방법의 수를 10007로 나눈 나머지"
 * 
 * 2. D[N]의 값을 어떻게하면 찾을 수 있을지 점화식을 생각한다. 
 * 2xN의 직사각형이 주어지면 마지막 위치에 2가지 방법 중 1가지를 선택할 수 있다.
 * 
 * Case 1) 세로로 1개를 놓는 경우 : 나머지 2 x (n-1) 크기의 직사각형을 채워넣어야함
 * Case 2) 가로로 2개를 놓는 경우 : 2 x (n-2) 크기의 직사각형ㅇ르 채워넣어야함
 * 따라서 D[N] = D[N-1] + D[N-2] 으로 점화ㅏ식을 구할 수 있다. 
 * 
 * 3. 다이나믹 프로그래밍 방법을 적용할 수 있는지 문제인지 확인 -> 1,2 번을 거쳐야 이게 잘 보임
 * 
 * 4. 코드 구현 
 *
 */
public class Solution11726 {
	public static void main(String[] args) {
		Solution11726 solution = new Solution11726();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[1001];
		
		d[0] = 1;
		d[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}
}
