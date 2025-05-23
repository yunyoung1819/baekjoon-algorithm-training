package baekJoon.thirteen;

import java.util.Scanner;

/**
 * 문제번호: 14681번
 * 문제제목: 사분면 고르기
 * 작 성 일 : 2020.06.20
 * 작 성 자 : YUN YOUNG
 *
 * 문제내용: 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
 * 사분면은 1부터 4까지 번호를 갖는다. "Quadrant n"은 제 n 사분면이라는 뜻이다.
 * 예를 들어, 좌표가 (12,5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제 1사분면에 속한다.
 * 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제 2사분면에 속한다.
 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
 * 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
 *
 * 입   력 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
 * 출   력 : 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
 */
public class Solution14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Solution14681 solution = new Solution14681();
        System.out.println(solution.findQuadrant(x, y));

        sc.close();
    }

    private int findQuadrant(int x, int y) {
        int quadrant = 0;
        if (x > 0 && y > 0) {
            quadrant = 1;
        }
        if (x < 0 && y > 0) {
            quadrant = 2;
        }
        if (x < 0 && y < 0) {
            quadrant = 3;
        }
        if (x > 0 && y < 0) {
            quadrant = 4;
        }
        return quadrant;
    }
}
