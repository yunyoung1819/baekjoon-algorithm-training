package programmers.challenge.level0;

/**
 * title: 부분 문자열
 * date: 2025.01.12
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181842
 */
public class PartString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";
        System.out.println(solution(str1, str2));

        String str3 = "tbt";
        String str4 = "tbbttb";
        System.out.println(solution(str3, str4));
    }

    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
