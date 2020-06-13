package baekJoon.level.thirteen;

import java.util.Scanner;

/**
 * 문제번호: 5613번
 * 문제제목: 계산기 프로그램
 * 문제링크: https://www.acmicpc.net/problem/5613
 * 작 성 일 : 2020.06.13
 * 작 성 자 : YUN YOUNG
 * 문   제 : 덧셈, 뺼셈, 곱셈, 나눗셈을 할 수 있는 계산기 프로그램을 만드시오.
 * 입   력 : 입력의 각 줄에는 숫자와 +, -, *, /, =중 하나가 교대로 주어진다. 첫 번째 줄은 수이다. 연산자의 우선 순위는 생각하지 않으며,
 * 입력 순서대로 계산을 하고, =가 주어지면, 그때까지의 결과를 출력한다. 주어지는 수는 108 이하의 양의 정수이다.
 * 계산 중 결과는 0 또는 음수가 될 수 있지만, -108 ~ 108 범위를 넘지는 않는다. 또, 나눗셈에서 소수점은 버린다. 따라서, 100/3*3 = 99이다.
 * 출   력 : 첫째 줄에 계산 결과를 출력한다.
 *
 */
public class Solution5613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number1, number2, operator;
        int result = 0;

        number1 = sc.next();
        result = Integer.parseInt(number1);

        while (sc.hasNext()) {
          operator = sc.next();
          if (operator.equals("=")) {
              break;
          }
          number2 = sc.next();
          result = calculate(number2, operator, result);
        }
        System.out.println(result);
        sc.close();
    }

    private static int calculate(String number2, String operator, int result) {
        if (operator.equals("+")) {
            result = result + Integer.parseInt(number2);
        }
        if (operator.equals("-")) {
            result = result - Integer.parseInt(number2);
        }
        if (operator.equals("*")) {
            result = result * Integer.parseInt(number2);
        }
        if (operator.equals("/")) {
            result = result / Integer.parseInt(number2);
        }
        return result;
    }
}
