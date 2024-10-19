package programmers.challenge.level0;

/**
 * 문제제목: 문자열 안에 문자열
 * 작 성 일: 2024.10.19
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */
public class StringInString {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(solution("ppprrrogrammers", "pppp"));
        System.out.println(solution("AbcAbcA", "AAA"));
    }

    private static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
