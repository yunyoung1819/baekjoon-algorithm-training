package programmers.challenge.level0;

/**
 * 문제제목: 암호 해독
 * 작 성 일: 2024.10.19
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120892
 */
public class Decryption {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

    private static String solution(String cipher, int code) {
        String answer = "";
        for (int i = code; i <= cipher.length(); i += code) {
            answer += cipher.charAt(i - 1);
        }
        return answer;
    }
}
