package programmers.challenge.level0;

/**
 * 문제제목: 인덱스 바꾸기
 * 작 성 일: 2024.11.01
 * 작 성 자: YUN YOUNG
 * 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */
public class IndexChange {
    public static void main(String[] args) {
        // Test Case
        String my_string = "I love you";
        int num1 = 3;
        int num2 = 6;
        System.out.println(solution(my_string, num1, num2));
    }

    private static String solution(String my_string, int num1, int num2) {

        char[] charArray = my_string.toCharArray();

        char temp = charArray[num1];

        charArray[num1] = charArray[num2];
        charArray[num2] = temp;
        return String.valueOf(charArray);
    }
}
