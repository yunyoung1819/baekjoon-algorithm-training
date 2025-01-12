package programmers.challenge.level0;

/**
 * title: 원하는 문자열 찾기
 * date: 2025.01.12
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181878
 */
public class FindString {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
        System.out.println(solution("aaAA", "aaaaa"));
    }

    public static int solution(String myString, String pat) {
        String myStringLowerCase = myString.toLowerCase();
        String patLowerCase = pat.toLowerCase();
        return myStringLowerCase.contains(patLowerCase) ? 1 : 0;
    }
}
