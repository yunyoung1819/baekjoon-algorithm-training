package baekJoon.two;

import java.util.Scanner;

/**
 * 문제번호 : 8393번
 * 문제제목 : 합
 * 문제내용 : n 이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 
 * 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 출력 : 1부터 n까지 합을 출력한다.
 *
 */
public class 합_013 {
	public static void main(String[] args) {
	    int n = 1;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        if(n >= 1 && n <= 100000) {
            for(int i = 1; i <= n; i++) {
                sum += i;
            }
        }else{
            System.out.println("n값의 범위가 유효하지 않습니다");
        }
        System.out.println(sum);
    }    
}

