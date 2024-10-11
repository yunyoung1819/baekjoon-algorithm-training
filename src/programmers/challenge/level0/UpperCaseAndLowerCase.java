package programmers.challenge.level0;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

    private static String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                c += 32;
            } else {
                c -= 32;
            }
            answer += c;
        }
        return answer;
    }
}
