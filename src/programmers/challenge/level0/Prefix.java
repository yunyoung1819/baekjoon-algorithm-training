package programmers.challenge.level0;

/**
 * title: 접두사인지 확인하기
 * date: 2024.12.15
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181906
 */
public class Prefix {
    public static void main(String[] args) {
        Prefix prefix = new Prefix();
        int result = prefix.isPrefix("banana", "bananan");
        System.out.println(result);
    }

    private int isPrefix(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }

        for (int i = 0; i < is_prefix.length(); i++) {
            if (is_prefix.charAt(i) != my_string.charAt(i)) {
                return 0;
            }
        }

        return 1;
    }
}
