package programmers.challenge.level0;

/**
 * title: 문자열 바꿔서 찾기
 * date: 2025.01.11
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181864
 */
public class StringSwitch {
    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
    }

    private static int solution(String myString, String pat) {
        String first = myString.replaceAll("A", "C");
        String second = first.replaceAll("B", "A");
        String third = second.replaceAll("C", "B");

        return third.contains(pat) ? 1 : 0;
    }
}
