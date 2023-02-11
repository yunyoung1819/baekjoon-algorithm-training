package programmers.problem.solving.string;

import java.util.Scanner;

/**
 * 문자찾기 리팩토링
 */
public class FindWordsRefactor {
    private static void solution(String input1, String input2) {
        String value1 = input1.toUpperCase();
        String value2 = input2.toUpperCase();
        char[] charArray = value1.toCharArray();

        int count = 0;
        for (char c : charArray) {
            if (c == value2.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        solution(input1, input2);
    }
}
