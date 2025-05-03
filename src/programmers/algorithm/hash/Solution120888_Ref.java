package programmers.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

public class Solution120888_Ref {
    public static void main(String[] args) {
        String my_string = "people";
        System.out.println(solution(my_string));
    }

    private static String solution(String myString) {
        Set<Character> used = new HashSet<>();

        StringBuilder builder = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (used.contains(c)) continue;
            used.add(c);
            builder.append(c);
        }

        return builder.toString();
    }
}
