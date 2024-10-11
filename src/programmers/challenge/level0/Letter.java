package programmers.challenge.level0;

/**
 * 문제제목: 편지
 * 작 성 일: 2024.09.15
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120898
 */
public class Letter {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    private static int solution(String message) {
        char[] charArray = message.toCharArray();
        return charArray.length * 2;
    }
}
