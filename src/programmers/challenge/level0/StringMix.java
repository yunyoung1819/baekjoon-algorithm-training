package programmers.challenge.level0;

/**
 * title: 문자열 섞기
 * date: 2025.01.25
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
public class StringMix {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1, str2));
    }

    private static String solution(String str1, String str2) {
        String mixedString = "";

        for (int i = 0; i < str1.length(); i++) {
            mixedString += str1.charAt(i);
            mixedString += str2.charAt(i);
        }

        return mixedString;
    }
}
