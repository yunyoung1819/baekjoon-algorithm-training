package programmers.challenge.level0;

/**
 * title: 문자열 정수의 합
 * date: 2024.11.23
 * author: yun young
 * link: https://school.programmers.co.kr/learn/courses/30/lessons/181849
 */
public class Sum {
    public static void main(String[] args) {
        String num_str = "123456789";
        System.out.println(solution(num_str));
    }

    private static int solution(String num_str) {
        char[] charArray = num_str.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += charArray[i] - '0';   // ASCII 코드에서 '0'은 48의 값을 갖고 있음
        }
        return sum;
    }
}
