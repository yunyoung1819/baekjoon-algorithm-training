package programmers.challenge.level0;

/**
 * title: 문자열의 앞의 n글자
 * date: 2024.12.13
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181907
 */
public class Solution181907 {
    public static void main(String[] args) {
        String my_string1 = "ProgrammerS123";
        int n1 = 11;
        System.out.println(solution(my_string1, n1));

        String my_string2 = "He110W0r1d";
        int n2 = 5;
        System.out.println(solution(my_string2, n2));
    }

    private static String solution(String my_string, int n) {
        char[] charArray = my_string.toCharArray();
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < n; i++) {
            newString.append(charArray[i]);
        }

        return newString.toString();
    }
}
