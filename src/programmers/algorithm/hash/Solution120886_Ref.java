package programmers.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

public class Solution120886_Ref {
    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";
        System.out.println(solution(before, after));
    }

    private static Map<Character, Integer> toMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    private static int solution(String before, String after) {
        return toMap(before).equals(toMap(after)) ? 1 : 0;
    }
}
