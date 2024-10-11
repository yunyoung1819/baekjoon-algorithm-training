package programmers.challenge;

/**
 * 문제제목: 문자 반복 출력하기
 * 작 성 일: 2024.09.17
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */
public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
