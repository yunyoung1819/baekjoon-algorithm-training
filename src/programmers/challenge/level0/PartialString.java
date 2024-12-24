package programmers.challenge.level0;

/**
 * title: 부분 문자열 이어 붙여 문자열 만들기
 * date: 2024.12.24
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181911
 */
public class PartialString {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {
                {0,4}, {1,2}, {3,5}, {7,7}
        };
        String result = solution(my_strings, parts);
        System.out.println(result);
    }

    private static String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            String partial = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            result.append(partial);
        }

        return result.toString();
    }
}
