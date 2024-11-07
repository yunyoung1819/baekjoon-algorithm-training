package programmers.challenge.level0;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {

        char[] charArray = my_string.toLowerCase().toCharArray();

        Arrays.sort(charArray);

        return String.valueOf(charArray);
    }
}
