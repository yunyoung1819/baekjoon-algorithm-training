package baekJoon.level.nine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 문제번호 : 10829번
 * 문제제목 : 이진수 변환 
 * 문제링크 : https://www.acmicpc.net/problem/10829
 * 작 성 일 : 2019.05.17
 * 작 성 자 : yun young
 * 문제내용 : 자연수 N이 주어진다. N을 이진수로 바꿔서 출력하는 프로그램을 작성하시오.
 * 입   력 : 첫째 줄에 자연수 N이 주어진다. (1 <= N <= 100,000,000,000,000)
 * 출   력 : N을 이진수로 바꿔서 출력한다. 이진수는 0으로 시작하면 안된다.
 *
 */
public class Solution10829 {
	public static void main(String[] args) {
		Solution10829 solution = new Solution10829();
		solution.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> binary = new ArrayList<Integer>();
		
		while (n > 0) {
			int remain = n % 2;
			binary.add(remain);
			n /= 2;
		}
		
		for (int i = 0; i < binary.size(); i++) {
			System.out.print(binary.get(i) + " ");
		}
	}
}
