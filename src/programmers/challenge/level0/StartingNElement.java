package programmers.challenge.level0;

import java.util.Arrays;

public class StartingNElement {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int[] array = solution(num_list, 2);

        for (int a : array) {
            System.out.println(a);
        }
    }

    private static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n -1 , num_list.length);
    }
}
