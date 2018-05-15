package baekJoon.level.two;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제번호 : 10817번
 * 문제제목 : 세 수
 * 문제내용 : 세 정수 A, B, C가 주어진다. 
 * 이 때 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 * 
 * 입력 : 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 * 출력 : 두 번째로 큰 정수를 출력한다.
 *
 */
public class 세수_012 {
	public static void main(String[] args) {
        int[] threeNum = new int[3];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            threeNum[i] = Integer.parseInt(scan.next());
        }
        
        Arrays.sort(threeNum); 
        
        System.out.println(threeNum[1]);
        
    }

}
