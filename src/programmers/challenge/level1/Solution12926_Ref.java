package programmers.challenge.level1;

public class Solution12926_Ref {
    public static void main(String[] args) {
        String s = "Z";
        int n = 7;
        System.out.println(solution(s, n));
    }

    private static char push(char c, int n) {
        if (!Character.isAlphabetic(c)) return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }

    private static String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            builder.append(push(c, n));
        }
        return builder.toString();
    }
}
