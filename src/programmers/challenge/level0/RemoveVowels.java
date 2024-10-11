package programmers.challenge.level0;

/**
 * 문제제목: 모음 제거
 * 작 성 일: 2024.10.11
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */
public class RemoveVowels {
    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        return my_string.replaceAll("a", "")
                .replaceAll("e", "")
                .replaceAll("i", "")
                .replaceAll("o", "")
                .replaceAll("u", "");
    }
}
